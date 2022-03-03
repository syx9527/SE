package com.syx.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int a = 12;

        System.out.println(a);

        int[] arr = {11, 22, 33};
        System.out.println(Arrays.toString(arr));
        arr[0] = a;
        arr[1] = 55;
        arr[2] = 66;
        System.out.println(Arrays.toString(arr));

        a = 98;
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------");
        int[] arr2 = arr;
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println("--------------");
        arr[1] = 5;
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("--------------");

        int[] arr3 = arr2.clone();
        System.out.println(arr);
        System.out.println(arr3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr3));

        System.out.println("------------------");

        arr[1] = 78;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.stream(arr).count() == arr.length);


        System.out.println("--------------");

    }
}
