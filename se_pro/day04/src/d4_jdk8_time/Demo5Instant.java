package d4_jdk8_time;

import java.time.Instant;
import java.time.ZoneId;

/**
 * 时间戳
 *
 * @author 17447
 */
public class Demo5Instant {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        //系统此刻时间戳
        Instant instant1 = Instant.now();

        instant1.atZone(ZoneId.systemDefault());
        System.out.println(instant1);


    }
}
