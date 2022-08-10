package oop.d3_static_test;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30};
        System.out.println(ArrayUtils.toString(arr));
        System.out.println(ArrayUtils.getAverage(arr));

        int[] arr1;
        arr1 = null;
        System.out.println(ArrayUtils.toString(arr1));
        System.out.println(ArrayUtils.getAverage(arr1));


    }
}
