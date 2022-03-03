package com.syx.test;

import java.util.Arrays;

/*
    数组元素的复制，把元素中的元素复制到另外一个数组去。
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};

        int[] arr2 = new int[arr1.length];
        copy(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    public static void copy(int[] arr1, int[] arr2) {
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
    }
}
