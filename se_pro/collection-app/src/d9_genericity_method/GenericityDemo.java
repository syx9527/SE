package d9_genericity_method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SLJ
 */
public class GenericityDemo {
    public static void main(String[] args) {

        String[] name = {"小璐", "黄蓉", "小柯"};
        printArray(name);
        Integer[] ages = {10, 20, 23};
        printArray(ages);

    }

    public static <E> void printArray(E[] arr) {
        StringBuilder stringBuilder = new StringBuilder("[");
        if (arr == null) {
            stringBuilder.append("]");
            System.out.println(stringBuilder);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]).append(i < arr.length - 1 ? ", " : "]");
        }
        System.out.println(stringBuilder);
    }
}
