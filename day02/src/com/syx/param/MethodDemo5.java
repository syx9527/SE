package com.syx.param;

import java.util.Random;

public class MethodDemo5 {
    public static void main(String[] args) {
        int n, r;
        n = 5;
        r = 10;

        int[] arr1 = {1, 2, 3}, arr2 = {1, 2, 3};
        System.out.println(arrayIs(arr1, arr2) ? "一样" : "不一样");

    }

    public static int[] getRandomArray(int n, int r) {
        int[] arr = new int[n];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(r);
        }
        return arr;
    }

    public static boolean arrayIs(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) {
            return true;
        }
        assert arr1 != null;
        assert arr2 != null;
        if (arr1.length != arr2.length) {
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

}
