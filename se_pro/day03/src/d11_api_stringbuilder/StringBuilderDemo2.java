package d11_api_stringbuilder;

/**
 * 需求：设计一个方法用于输出人愿意整形数组的内容，要求输出成如下格式：
 * [11, 22, 33, 44, 55]
 *
 * @author 17447
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};

        String res = arrayToString(arr);
        System.out.println(res);

        int[] arr2 = {};
        System.out.println(arrayToString(arr2));
    }

    public static String arrayToString(int[] arr) {
        if (arr == null || arr.length == 0) {
            return "[]";
        }
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            s.append(arr[i]).append(i == arr.length - 1 ? "]" : ", ");
        }
        s.append("]");
        return s.toString();
    }
}
