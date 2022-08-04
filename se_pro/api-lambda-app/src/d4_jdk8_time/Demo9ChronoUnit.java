package d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * ChronoUnit:
 * 可以用于在单个时间内测量一段时间，这个工具类是最安全的了，可以用于比较所有的时间单位
 *
 * @author SYX
 */
public class Demo9ChronoUnit {
    public static void main(String[] args) {

        // 本地日期对象，此刻
        LocalDateTime today = LocalDateTime.now();
        System.out.println("today: " + today);

        // 出生日期
        LocalDateTime birthDate = LocalDateTime.of(1998, 11, 20, 10, 50, 59);
        System.out.println("birthDate: " + birthDate);

        System.out.println("相差的年数: " + ChronoUnit.YEARS.between(birthDate, today));
        System.out.println("相差的月数: " + ChronoUnit.MONTHS.between(birthDate, today));
        System.out.println("相差的周数: " + ChronoUnit.WEEKS.between(birthDate, today));
        System.out.println("相差的天数: " + ChronoUnit.DAYS.between(birthDate, today));
        System.out.println("相差的时数: " + ChronoUnit.HOURS.between(birthDate, today));
        System.out.println("相差的分数: " + ChronoUnit.MINUTES.between(birthDate, today));
        System.out.println("相差的秒数: " + ChronoUnit.SECONDS.between(birthDate, today));
        System.out.println("相差的毫秒数: " + ChronoUnit.MILLIS.between(birthDate, today));
        System.out.println("相差的微秒数: " + ChronoUnit.MICROS.between(birthDate, today));
        System.out.println("相差的纳秒数: " + ChronoUnit.NANOS.between(birthDate, today));
        System.out.println("相差的半天数: " + ChronoUnit.HALF_DAYS.between(birthDate, today));
        System.out.println("相差的十年数: " + ChronoUnit.DECADES.between(birthDate, today));
        System.out.println("相差的世纪(百年)数: " + ChronoUnit.CENTURIES.between(birthDate, today));
        System.out.println("相差的千年数: " + ChronoUnit.MILLENNIA.between(birthDate, today));
        System.out.println("相差的纪元数: " + ChronoUnit.ERAS.between(birthDate, today));


    }
}
