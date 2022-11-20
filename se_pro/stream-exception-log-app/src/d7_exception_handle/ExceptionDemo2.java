package d7_exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常处理方式 2—— try...catch...
 * -
 * - 监视捕获异常，用在方法内部，可以将方法内部下出现的异常直接捕获处理
 * - **这种方式还可以，发生异常的的方法自己独立完成异常的处理，程序可以继续往下执行
 *
 * @author SYX
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("start");
        parseTime("2022-11-20 18:11:23");
        System.out.println("over");
    }

    public static void parseTime(String timeStr) {


        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-/MM-dd HH:mm:ss");
            Date date = sdf.parse(timeStr);
            System.out.println(date);
            FileInputStream file = new FileInputStream("D:/img/image.jpg");
        } catch (Exception e) { // 拦截一切异常
            e.printStackTrace();
        }


        /*
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-/MM-dd HH:mm:ss");
            Date date = sdf.parse(timeStr);
            System.out.println(date);
            FileInputStream file = new FileInputStream("D:/img/image.jpg");
        } catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }
        */

        /*
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-/MM-dd HH:mm:ss");
            Date date = sdf.parse(timeStr);
            System.out.println(date);
            FileInputStream file = new FileInputStream("D:/img/image.jpg");
        } catch (FileNotFoundException e) {
            // 打印异常栈信息
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        */

        /*
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-/MM-dd HH:mm:ss");
            Date date = sdf.parse(timeStr);
            System.out.println(date);
        } catch (ParseException e) {
            // 解析出现异常
            System.out.println("出现解析异常");
            // e.printStackTrace();
        }
        try {
            FileInputStream file = new FileInputStream("D:/img/image.jpg");
        } catch (FileNotFoundException e) {
            // 文件不存在异常
            System.out.println("出现文件不存在异常");
            // e.printStackTrace();
        }
        */


    }
}
