package d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Duration 用于计算时间间隔差异
 *
 * @author SYX
 */
public class Demo8Duration {
    public static void main(String[] args) {
        // 本地日期时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println("today: " + today);

        //  出生前的日期时间对象
        LocalDateTime birthDate = LocalDateTime.of(2021, 3, 14, 20, 0, 0);
        System.out.println("birthDate: " + birthDate);

        // 第二个减去第一个参数
        Duration duration = Duration.between(birthDate, today);

        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toNanos());


    }
}
