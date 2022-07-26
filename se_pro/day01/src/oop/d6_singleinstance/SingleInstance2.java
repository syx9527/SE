package oop.d6_singleinstance;

/**
 * 目标：学会使用懒汉单例方式定义单例类
 * @author SYX
 */
public class SingleInstance2 {

    // 2.定义一个静态成员变量存储一个本类对象，注意，此时不能初始化对象

    // public static SingleInstance2 instance; // null


    private static SingleInstance2 instance; // null


    // 1.把构造器私有

    private SingleInstance2() {

    }

    public static SingleInstance2 getInstance() {
        if (instance == null) {
            instance = new SingleInstance2();
        }
        return instance;
    }


}
