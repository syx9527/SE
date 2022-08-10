package d4_polymorphlic_test;

import javax.crypto.spec.PSource;

/**
 * 目标：USB设备模拟
 * 1.定义USB接口：插入、拔出
 * 2.定义2个USB实现类：鼠标、键盘
 * 3.创建一个电脑对象，创建USB设备对象，安装启动
 *
 * @author 17447
 */
public class Test {
    public static void main(String[] args) {
        // a.创建电脑对象
        Computer c = new Computer("SYX的电脑");
        c.start();

        // b.创建鼠标、键盘对象
        USB usb = new Mouse("罗技102鼠标");
        c.installUsb(usb);


    }
}

/**
 * USB
 */
interface USB {
    /**
     * 接入
     */
    void connect();

    /**
     * 拔出
     */
    void unConnect();
}

class KeyBoard implements USB {
    private String name;

    public KeyBoard() {
    }

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 独有功能
     */
    public void keyDown() {
        System.out.println(this.name + "敲击了一小下~");
    }


    @Override
    public void connect() {
        System.out.println(this.name + "成功接入了电脑");
    }

    @Override
    public void unConnect() {
        System.out.println(this.name + "成功从电脑拔出");
    }
}

class Mouse implements USB {
    private String name;

    public Mouse() {
    }

    public Mouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 独有功能
     */
    public void click() {
        System.out.println(this.name + "长按一键三连~~~~");
    }


    @Override
    public void connect() {
        System.out.println(this.name + "成功接入了电脑");
    }

    @Override
    public void unConnect() {
        System.out.println(this.name + "成功从电脑拔出");
    }
}

class Computer {
    private String name;

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }

    /**
     * 开机
     */
    public void start() {
        System.out.println(this.name + "开机");
    }

    public void end() {
        System.out.println(this.name + "关机");
    }

    /**
     * 提供安装USB设备的入口
     *
     * @param usb USB设备
     */
    public void installUsb(USB usb) {
        // 多态： usb 可能是鼠标可能是键盘
        // 接入
        usb.connect();

        // 独有功能
        if (usb instanceof KeyBoard) {
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.keyDown();
        } else if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }

        // 拔出
        usb.unConnect();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}