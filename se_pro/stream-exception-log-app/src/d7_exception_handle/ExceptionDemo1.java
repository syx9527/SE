package d7_exception_handle;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常的默认处理流程
 * -
 * 1. 默认会在出现异常的代码处自动创建一个异常对象：`ArithmeticException`。
 * 2. 异常会从方法中出现的点这里抛出给调用者，调用者最总抛出给JVM虚拟机
 * 3. 虚拟机接收到异常对象后，现在控制台直接输出异常栈信息数据。
 * 4. 直接从当前执行的异常点单调当前程序。
 * 5. 后续代码不再执行。
 *
 * @author SYX
 */
public class ExceptionDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("start");
        parseTime("2022-11-20 18:11:23");
        System.out.println("over");
    }

    public static void parseTime(String timeStr) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(timeStr);
        System.out.println(date);
        FileInputStream file = new FileInputStream("D:/img/image.jpg");
    }
}
