package d4_jdk8_time;

import java.time.LocalTime;

/**
 * @author 17447
 */
public class Demo2LocalTime {
    public static void main(String[] args) {
        // 1.获取本地时间对象
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime: " + nowTime);
    }
}
