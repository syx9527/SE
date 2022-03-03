package com.syx.method;

public class MethodDemo2 {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static void sumPrint(int a, int b) {
        System.out.println(sum(a, b));
    }

    public static void main(String[] args) {
        int a = 1, b = 5;
        double c = a * 1.0, d = b * 1.0;
        System.out.println(sum(a, b));
        System.out.println(sum(c, d));
        sumPrint(a, b);
        sumPrint(a, b);

    }


}