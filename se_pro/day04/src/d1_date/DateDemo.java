package d1_date;

import java.util.Date;

/**
 * 目标：学会使用Date 类处理时间，获取时间的信息
 *
 * @author SYX
 */
public class DateDemo {
    public static void main(String[] args) {
        //  1.创建一个Date类的对象，代表系统此刻时间日期对象
        Date date = new Date();
        System.out.println(date);

        // 2.获取时间毫秒值
        long time1 = System.currentTimeMillis();
        System.out.println(time1);
        System.out.println("---------------------");

        // 得到当前时间毫秒值
        long time2 = System.currentTimeMillis();
        // 当前时间往后走 1 h 121 s
        time2 += (60 * 60 + 121) * 1000;
        // 把时间毫秒值转换成对应的时间对象
        Date date2 = new Date(time2);
        System.out.println(date2);
        // 以下也行
        Date date3 = new Date();
        date3.setTime(time2);
        System.out.println(date3);
    }
}
