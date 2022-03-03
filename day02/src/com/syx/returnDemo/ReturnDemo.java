package com.syx.returnDemo;

public class ReturnDemo {
    public static void main(String[] args) {
        valid(3, 2);
        valid(3, 0);

    }

    public static void valid(int a, int b) {
        if (b == 0) {
            System.out.println("Error:The valid number can't is 0 !");
            return;

        }

        int c = a / b;
        System.out.printf("%s/%s=%s%n", a, b, c);
    }
}
