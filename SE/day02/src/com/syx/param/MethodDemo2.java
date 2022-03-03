package com.syx.param;

import java.util.Arrays;

public class MethodDemo2 {
    public static void main(String[] args) {
        int[] a = {20, 30, 40};

        int b = a[0];
        change(a);
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println(b);
        System.out.println("--------------");
    }

    public static void change(int[] a) {
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        a[0] = 33333;
        System.out.println(Arrays.toString(a));
    }
}
