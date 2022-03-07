package oop.d3_static_test;

public class ArrayUtils {
    /**
     * 构造器私有化
     */
    public ArrayUtils() {
    }

    /**
     * 静态包，工具方法
     */
    public static String toString(int[] arr) {

        if (arr != null) {
            String result = "[";
            for (int i = 0; i < arr.length; i++) {
                result += i == arr.length - 1 ? arr[i] : arr[i] + ",";

            }
            result += "]";
            return result;
        } else {
            return null;
        }

    }

    public static double getAverage(int[] arr) {

        // 总和 最大值 最小值

        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
            sum += j;
        }
        return (sum - max - min) * 1.0 / (arr.length - 2);
    }
}
