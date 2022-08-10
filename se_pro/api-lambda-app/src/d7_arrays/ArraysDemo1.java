package d7_arrays;

import java.util.Arrays;

/**
 * 列表
 *
 * @author 17447
 */
public class ArraysDemo1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 3, 44, 56, 63, 4};
        System.out.println(arr);

        // 返回数组内容
        String res = Arrays.toString(arr);
        // [10, 20, 3, 44, 56, 63, 4]
        System.out.println(res);

        // 排序，默认升序排序
        Arrays.sort(arr);
        // [3, 4, 10, 20, 44, 56, 63]
        System.out.println(Arrays.toString(arr));

        // 二分搜索，需要先排序
        int i = Arrays.binarySearch(arr, 55);
        System.out.println(i);

        int[] arr2 = {12, 32, 34, 25, 11, 12, 336, 100, 2};
        System.out.println(Arrays.binarySearch(arr2, 32));
    }
}
