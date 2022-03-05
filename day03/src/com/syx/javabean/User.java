package com.syx.javabean;

public class User {
    private String name;
    private double height;
    private double money;

    public User() {
    }

    public User(String name, double height, double money) {
        this.name = name;
        this.height = height;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", money=" + money +
                '}';
    }


}
