package com.syx.param;

public class MethodDemo3 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 5};
        System.out.println(printArray(arr));
    }

    public static String printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            return "[]";
        }
        arr[0] = 656;
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            s.append(i == arr.length - 1 ? arr[i] + "" : arr[i] + ",");
        }
        s.append("]");
        // System.out.println(s);
        return s.toString();
    }
}
