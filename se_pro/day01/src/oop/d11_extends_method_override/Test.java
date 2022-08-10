package oop.d11_extends_method_override;

public class Test {
    public static void main(String[] args) {
        newPhone mi10 = new newPhone();
        mi10.setName("Mi 10");
        mi10.call();
        mi10.sendMassage();

    }
}

class Phone {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Phone() {
    }


    public void call() {
        System.out.println("打电话");
    }

    public void sendMassage() {
        System.out.println("发信息");
    }

    public static void test() {
    }

    private void test1() {
    }
}

class newPhone extends Phone {
    public newPhone() {
    }


    @Override
    public void call() {
        super.call();
        System.out.println(this.getName() + "支持视频通话");
    }

    @Override
    public void sendMassage() {
        super.sendMassage();
        System.out.println(this.getName() + "发送表情信息");
    }
    /*
    public static void test() {}
    */

    //    私有方法不能重写
    //    @Override
    public void test1() {
    }
}