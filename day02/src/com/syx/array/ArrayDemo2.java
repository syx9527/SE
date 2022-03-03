package com.syx.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo2 {
    public static int[] remove(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }

        }

        return a;
    }

    public static void main(String[] args) {

        int[] a = new int[5];
        Random r = new Random();
        //    冒泡排序
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(500);
        }
        System.out.println(Arrays.toString(a));

        a = remove(a);
        System.out.println(Arrays.toString(a));
    }
}
