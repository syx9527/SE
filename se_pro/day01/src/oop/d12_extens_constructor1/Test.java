package oop.d12_extens_constructor1;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("*************");
        Cat cat2 = new Cat("加菲猫");
    }
}

class Cat extends Animal {

    static {
        System.out.println("子类代码块");
    }

    public Cat() {
        System.out.println("====猫--无参构造器====");
    }

    public Cat(String name) {
        System.out.println("====" + name + "--有参构造器====");
    }
}

class Animal {
    static {
        System.out.println("父类代码块");
    }

    public Animal() {
        System.out.println("====动物--无参构造器====");
    }
}
