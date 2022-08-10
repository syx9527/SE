package d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author 17447
 */
public class Demo1LocalDate {
    public static void main(String[] args) {
        // 1.获取本地日期对象
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate: " + nowDate);

        int year = nowDate.getYear();
        System.out.println("year: " + year);

        int month = nowDate.getMonthValue();
        System.out.println("month: " + month);

        int day = nowDate.getDayOfMonth();
        System.out.println("day: " + day);

        // 当年的第几天
        int dayOfYear = nowDate.getDayOfYear();
        System.out.println("dayOfYear: " + dayOfYear);

        // 星期
        System.out.println("dayOfWeek: " + nowDate.getDayOfWeek());
        System.out.println("dayOfWeek: " + nowDate.getDayOfWeek().getValue());

        // 月份
        System.out.println("month: " + nowDate.getMonth());
        System.out.println("month: " + nowDate.getMonth().getValue());


        System.out.println("-----------------------");
        LocalDate bt = LocalDate.of(1991, 11, 11);
        System.out.println(bt);
        System.out.println(LocalDate.of(1991, 11, 11));
    }
}
