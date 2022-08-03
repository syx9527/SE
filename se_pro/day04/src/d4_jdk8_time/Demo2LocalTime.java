package d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author 17447
 */
public class Demo2LocalTime {
    public static void main(String[] args) {
        // 1.获取本地时间对象
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime: " + nowTime);

        // 时
        int hour = nowTime.getHour();
        System.out.println("hour: " + hour);

        // 分
        int minute = nowTime.getMinute();
        System.out.println("minute: " + minute);

        // 秒
        int second = nowTime.getSecond();
        System.out.println("second: " + second);

        // 纳秒
        int nano = nowTime.getNano();
        System.out.println("nano: " + nano);
        System.out.println("-----------------");


        System.out.println(LocalTime.of(8, 20));
        System.out.println(LocalTime.of(8, 20, 30));
        System.out.println(LocalTime.of(8, 20, 30, 15));
        System.out.println("-----------------");

        System.out.println(LocalDateTime.of(1661, 11, 20, 15, 36));
        System.out.println(LocalDateTime.of(1661, 11, 20, 15, 36,36));


    }
}
