package com.syx.overload;


import java.io.OutputStream;

public class MethodDemo1 {
    public static void main(String[] args) {
        int n = 5;
        String location = "漂亮国";
        fire();
        fire(location);
        fire(location, n);


    }

    public static void fire() {
        System.out.println("发送1枚导弹----");
    }

    public static void fire(String location) {
        System.out.printf("给%s发送1枚导弹----%n", location);
    }

    public static void fire(String location, int n) {
        System.out.printf("给%s发送%s枚导弹----%n", location, n);
    }
}
