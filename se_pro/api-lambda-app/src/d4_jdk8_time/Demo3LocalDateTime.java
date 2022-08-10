package d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author 17447
 */
public class Demo3LocalDateTime {
    public static void main(String[] args) {
        // 日期 时间
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime: " + nowDateTime);
        System.out.println("year: " + nowDateTime.getYear());
        System.out.println("month: " + nowDateTime.getMonthValue());
        System.out.println("day: " + nowDateTime.getDayOfMonth());
        System.out.println("hour: " + nowDateTime.getHour());
        System.out.println("minute: " + nowDateTime.getMinute());
        System.out.println("second: " + nowDateTime.getSecond());

        // 日：当年的第几天
        System.out.println("dayOfYear: " + nowDateTime.getDayOfYear());

        // 星期
        System.out.println("dayOfWeek: " + nowDateTime.getDayOfWeek());
        System.out.println("dayOfWeek: " + nowDateTime.getDayOfWeek().getValue());

        // 月份
        System.out.println("month: " + nowDateTime.getMonth());
        System.out.println("month: " + nowDateTime.getMonth().getValue());

        LocalTime ld = nowDateTime.toLocalTime();
        System.out.println(ld.getHour());
        System.out.println(ld.getMinute());
        System.out.println(ld.getSecond());
    }
}
