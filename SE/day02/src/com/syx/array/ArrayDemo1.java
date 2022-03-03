package com.syx.array;


import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        double[] scores;
        scores = new double[]{55, 66, 68};
        String[] name;
        name = new String[]{"Lisa", "V", "Jinx"};
        int[] age;
        age = new int[]{24, 26, 25};
        // System.out.println(scores);
        System.out.println(age[0]);
        age[2] = 100;
        System.out.println(Arrays.toString(age));
        int[] a;
        a = new int[]{4, 5, 6,};

        // 动态初始化格式
        int[] arr = new int[3];
        arr[1] = 2;
        System.out.println(arr.length);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
