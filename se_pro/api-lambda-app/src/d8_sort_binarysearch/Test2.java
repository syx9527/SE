package d8_sort_binarysearch;

import java.util.Arrays;

/**
 * 二分查找
 *
 * @author 17447
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 28, 30, 14, 16, 35, 88, 100};
        // 排序
        Test1.choiceSort(arr);
        System.out.println(Arrays.toString(arr));
        // 查找
        int index = binarySearch(arr, 27);
        System.out.println(index);

    }

    /**
     * 二分查找
     *
     * @param arr  有序数组
     * @param data 需要查找的数字
     * @return 索引
     */
    public static int binarySearch(int[] arr, int data) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int midIndex = (left + right) / 2;
            if (data > arr[midIndex]) {
                left = midIndex + 1;
            } else if (data < arr[midIndex]) {
                right = midIndex - 1;
            } else {
                return midIndex;
            }
        }
        // 数组中没有没有找到该数据
        return -1;
    }


}
