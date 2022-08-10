package oop.d3_static_test;

/**
 * @author SYX
 */
public class ArrayUtils {
    /**
     * 构造器私有化
     */
    private ArrayUtils() {
    }

    /**
     * 静态包，工具方法
     */
    public static String toString(int[] arr) {

        if (arr != null) {
            StringBuilder result = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                result.append(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
            }
            result.append("]");
            return result.toString();
        } else {
            return null;
        }

    }

    public static double getAverage(int[] arr) {
        if (arr == null) {
            return -1;
        }
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
