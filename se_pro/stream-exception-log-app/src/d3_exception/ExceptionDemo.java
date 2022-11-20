package d3_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 什么是异常
 * -
 * - 异常是程序在“编译”、执行的过程中可能出现的问题，注意：语法错误不算在异常体系中。
 * - 比如：数组索引越界、空指针异常、日期格式化异常，等……
 * ---------------------
 * 为什么要学习异常
 * -
 * - 异常一旦出现了，如果没有提前处理，程序就会退出JVM虚拟机而终止。
 *
 * @author SYX
 */
public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        /* 1.数组索引越界异常：ArrayIndexOutOfBoundsException */
        int[] arr = {10, 20, 40};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // System.out.println(arr[3]); // 出现异常，程序退出，下一行不会执行
        System.out.println("-----exit()-----");

        /*2.空指针异常NullPointerException。直接输出没有问题，但是直接调用空指针的变量的功能就会报错*/
        String name = null;
        // null 可以输出
        System.out.println(name);
        // System.out.println(name.length());  // 空指针异常

        /*3.数学操作异常：ArithmeticException*/

        // int c =10/.0

        /*4.类型转换异常：ClassCastException*/

        Object o = 23;


        // String s = (String) o; // 报错

        /*5.数字转换异常：NumberFormatException*/
        String number = "34aa";
        Integer it = Integer.valueOf(number);
        System.out.println(it + 1);


        System.out.println("over");

    }
}
