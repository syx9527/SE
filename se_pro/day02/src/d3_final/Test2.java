package d3_final;

public class Test2 {
    public static void main(String[] args) {
        // 1.final 修饰基本类型变量，其数据不能再改变
        final double pi = 3.14;
        // pi=3.15;

        //2. final 修饰引用数据类型的变量，变量中存储的地址不能改变，但是地址只想的对象内容可以改变。

        final int[] arr = {10, 20, 30, 40};
        System.out.println(arr);
        // arr = {60, 30, 40};
        arr[0] = 5;
        System.out.println(arr);

    }
}
