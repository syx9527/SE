package d2_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目标：SimpleDateFormat 简单日期格式化类的使用
 * 格式化时间
 * 解析时间
 *
 * @author SYX
 */
public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
        // 1.日期对象
        Date d = new Date();
        System.out.println(d);

        // 2.格式化这个时间的对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String res = simpleDateFormat.format(d);
        System.out.println(res);
        System.out.println("---------------");
        // 格式化时间毫秒值
        long time1 = System.currentTimeMillis() + 121 * 1000;
        String res2 = simpleDateFormat.format(time1);
        System.out.println(res2);
        System.out.println("---------------");


    }
}
