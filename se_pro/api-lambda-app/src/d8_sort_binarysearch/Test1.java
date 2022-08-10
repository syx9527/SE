package d8_sort_binarysearch;

import java.util.Arrays;

/**
 * 快速排序\
 *
 * @author 17447
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};
        choiceSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 快速排序算法
     *
     * @param arr 原数组
     */
    public static void choiceSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
