package d7_exception_handle;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常处理方式 2—— try...catch...
 * -
 * - 方法直接将异常通过`throws`抛出去给调用者
 * - 调用者收到异常后直接捕获处理
 *
 * @author SYX
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            parseTime("2022-11-20 18:11:23");
            System.out.println("success!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error!");
        }
        System.out.println("over");
    }

    public static void parseTime(String timeStr) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(timeStr);
        System.out.println(date);
        FileInputStream file = new FileInputStream("D:/img/image.jpg");
    }
}
