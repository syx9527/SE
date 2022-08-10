package d14_interface_attention;

public class Test {


    public static void main(String[] args) {


        // 1.接口不能床架对象（接口更加彻底的抽象）；

        // 2.一个类实现多个接口，多个接口中有同样的静态方法不冲突；


        // 3.一个类继承了父类，同时又实现了接口，父类中和接口中同名方法，默认用父类的；
        Cat c = new Cat();
        c.eat();

        // 4.一个类实现了多个接口，多个接口中存在同名的默认方法，不冲突，这个类重写该方法即可；

        // 5。一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能多继承。
    }
}

interface AAA {
    default void run() {
    }

}

interface BBB {
    default void run() {
    }


    void go();
}

interface CCC extends AAA, BBB {

    @Override
    default void run() {
        AAA.super.run();
    }
}


interface Food {
    default void eat() {
        System.out.println("接口--吃");
    }
}

class Animal {
    public void eat() {
        System.out.println("父类动物--吃");
    }
}

class Cat extends Animal implements Food, A {

}

interface A {
    static void test() {
        System.out.println("A");
    }
}


interface B {
    static void test() {
        System.out.println("B");
    }
}

class C implements A, B {

}