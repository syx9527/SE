package com.syx.method;

public class MethodDemo1 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;

        }
    }

    public static double max(double a, double b) {

        return (a > b) ? a : b;

    }

    public static void main(String[] args) {
        int a = 1, b = 3;
        int c = sum(a, b);
        System.out.println(c);
        System.out.println(max(a, b));
        System.out.println(max(a * 1.0, b * 1.0));
    }
}
