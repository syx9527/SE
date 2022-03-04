package com.syx.createObject;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();

        c.setPrice(65);
        System.out.println(c.getPrice());
        System.out.println(c.price);
        c.start();
        c.run();
    }
}
