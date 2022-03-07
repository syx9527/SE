package com.syx.thisdemo;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        System.out.println(c);

        System.out.println("-----------");

        Car c2 = new Car("CC", 32.9);
        System.out.println(c2.name);
        System.out.println(c2.price);
        c2.toWith("HON");

    }
}
