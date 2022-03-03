package com.syx.test;

import java.util.Arrays;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        int n = 6, r = 100;
        int[] arr = getRandomArray(n, r);
        System.out.println("6位评委打分为：");
        System.out.println(Arrays.toString(arr));
        System.out.println("选手最终得分为：");
        double valid = getValid(arr);
        System.out.println(valid);
    }

    public static double getValid(int[] arr) {
        int max = arr[0], min = arr[0], sum = 0;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
            sum += j;

        }

        return (double) (sum - max - min) / (arr.length - 2);
    }

    public static int[] getRandomArray(int n, int r) {
        int[] arr = new int[n];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(r);
        }
        return arr;
    }

}
