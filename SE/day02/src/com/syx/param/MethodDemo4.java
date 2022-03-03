package com.syx.param;

import java.util.Arrays;
import java.util.Random;

public class MethodDemo4 {

    public static void main(String[] args) {
        Random ran = new Random();
        int n = 6;
        int r = 10;
        int[] arr = getRandomArray(n, r);
        System.out.println(Arrays.toString(arr));
        int data = ran.nextInt(r);
        System.out.println(data);
        System.out.println(isValid(arr, data));
    }

    public static int[] getRandomArray(int n, int r) {
        int[] arr = new int[n];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(r);
        }
        return arr;
    }

    public static int isValid(int[] arr, int data) {

        for (int i = 0; i < arr.length; i++) {
            if (data == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
