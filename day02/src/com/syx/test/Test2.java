package com.syx.test;

public class Test2 {
    public static void main(String[] args) {
        int n;
        n = 100;
        System.out.println(getSu(n) ? "%s是素数%n".formatted(n) : "%s不是素数%n".formatted(n));
        String s = "";
        for (int i = 2; i <= n; i++) {
            if (getSu(i)) {
                s += i < n ? i + "," : "" + i;
            }

        }
        System.out.println(s);
    }

    public static boolean getSu(int n) {

        for (int i = 2; i <= (int) (Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
