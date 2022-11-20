package d7_exception_handle;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * *异常处理方式1——throws**
 * -
 * - throws:用在方法上，可以将方法内部出现的异常抛出去给本方法的调用者处理。
 * - 这种方式并不好，发生异常的方法自己不处理异常，如果异常最终抛出去给虚拟机将引起虚拟机死亡。
 *
 * @author SYX
 */
public class ExceptionDemo3 {
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
