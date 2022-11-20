package d5_excetion_javac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author SYX
 */
public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {

        String date = "20222-11-20 17:37:52";

        // 创建简单日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 解析字符串时间成为日期对象
        Date d = sdf.parse(date);
        System.out.println(d.getSeconds());
    }
}
