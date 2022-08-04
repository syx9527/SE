package d3_calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 17447
 */
public class CalendarDemo1 {
    public static void main(String[] args) {
        System.out.println("**************");
        // 1.拿到系统此刻日历对象
        Calendar cal = Calendar.getInstance();
        // 2.获取日历信息
        System.out.println(cal);
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        // 月份需要+1
        int month = cal.get(Calendar.MONTH) + 1;
        System.out.println(month);
        int date = cal.get(Calendar.DATE);
        System.out.println(date);
        int days = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
        int s = cal.get(Calendar.WEEK_OF_MONTH);
        System.out.println(s);
        System.out.println("**************");


        // 3. public void set (int field, int value):修改日历的某个字段信息
        //cal.set(Calendar.HOUR, 12);
        // System.out.println(cal.get(Calendar.HOUR));

        cal.add(Calendar.DAY_OF_YEAR, 64);
        cal.add(Calendar.MINUTE, 9);
        Date d = cal.getTime();
        System.out.println(d);
        System.out.println("**************");
        // 4. public void add(int field, int amount):为某个字段增加/减少指定的值
        // 请问64天后是什么时间

        // 5. public final Date getTime():拿到刺客日期对象。
        long time = cal.getTimeInMillis();
        System.out.println(time);
        System.out.println("**************");


        // 6. public long getTimeMillis():拿到此刻时间毫秒值


    }
}
