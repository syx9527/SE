package com.syx.test;

import java.util.Arrays;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        int n = 20, r = 100;
        int[] arr = getRandomArray(n, r);

        System.out.println(Arrays.toString(arr));

        bash(arr);
        System.out.println(Arrays.toString(arr));
        remove(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] getRandomArray(int n, int r) {
        int[] arr = new int[n];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(r);
        }
        return arr;
    }

    public static void bash(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] = arr[i] % 10;

        }

    }

    public static void remove(int[] arr) {

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

        }
    }
}
