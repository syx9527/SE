package com.syx.method;

import java.util.Arrays;
import java.util.Random;

public class MethodDemo4 {
    public static void main(String[] args) {
        int[] arr = getRandomArray(5, 100);
        int maxData = getArrayMaxData(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("数组中最大值位" + maxData);

    }

    public static int[] getRandomArray(int n, int r) {
        int[] arr = new int[n];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(r);
        }
        return arr;
    }

    public static int getArrayMaxData(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
