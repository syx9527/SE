package com.syx.thisdemo;

public class Car {
    String name;
    double price;
    String color;

    public Car() {
        System.out.printf("无参数构造器中的this:%s%n", this);
    }

    public Car(String name, double price) {
        System.out.printf("有参数构造器中的this:%s%n", this);
        this.name = name;
        this.price = price;

    }

    public void toWith(String name) {
        System.out.printf("%s正在和%s比赛%n", this.name, name);
    }

    public void run() {
        System.out.printf("方法中的this:%s%n", this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
