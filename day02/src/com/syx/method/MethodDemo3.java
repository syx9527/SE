package com.syx.method;

public class MethodDemo3 {
    public static void main(String[] args) {
        int n = 62;
        System.out.println(sum(n));

        System.out.println(sum(2, n));
        System.out.printf("%s%s偶数%n", n, isValid(n) ? "是" : "不是");
    }

    public static int sum(int s, int n) {
        int sum = 0;
        for (int i = s; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static boolean isValid(int n) {
        return n % 2 == 0;
    }
}
