package com.syx.constructor;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "本田";
        c1.price = 32;
        System.out.println(c1.name);
        System.out.println(c1.price);

        Car c2 = new Car("本田", 32);


        System.out.println(c2.name);
        System.out.println(c2.price);


    }
}
