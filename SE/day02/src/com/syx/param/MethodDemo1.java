package com.syx.param;

public class MethodDemo1 {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);


    }

    public static void change(int a) {
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }
}
