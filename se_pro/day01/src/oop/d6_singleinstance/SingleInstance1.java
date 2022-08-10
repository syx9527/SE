package oop.d6_singleinstance;

/**
 * 目标：学会使用饿汉单例方式定义单例类
 *
 * @author SYX
 */
public class SingleInstance1 {
    /**
     * 2.定义一个公开的静态成员变量存储一个类对象
     */
    public static SingleInstance1 instance = new SingleInstance1();

    /**
     * 1.把构造器私有
     */
    private SingleInstance1() {

    }

}
