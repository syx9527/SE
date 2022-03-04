package com.syx.createObject;

public class Car {
    String name;
    double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void start() {
        System.out.printf("%s，价格是：%s启动了%n", name, price);
    }

    public void run() {
        System.out.printf("%s，价格是：%s跑得很快%n", name, price);
    }
}
