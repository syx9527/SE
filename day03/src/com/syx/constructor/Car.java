package com.syx.constructor;

public class Car {
    String name;
    double price;

    public Car() {
        System.out.println("*****无参数构造器启用了*****");
    }

    public Car(String n, double p) {
        System.out.println("*****有参数构造器启用了*****");
        name = n;
        price = p;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
