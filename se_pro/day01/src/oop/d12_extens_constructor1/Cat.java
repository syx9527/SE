package oop.d12_extens_constructor1;

public class Cat extends Animal {
    public Cat() {
        System.out.println("====猫--无参数====");
    }

    public Cat(String name) {
        System.out.println("====" + name + "====");
    }
}
