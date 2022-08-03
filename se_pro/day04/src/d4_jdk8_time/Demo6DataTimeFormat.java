package d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author SYX
 */
public class Demo6DataTimeFormat {
    public static void main(String[] args) {

        // 本次此刻，日期时间对象
        LocalDateTime localDateTime = LocalDateTime.now();
        // 2022-08-03T19:57:21.029
        System.out.println(localDateTime);

        // 解析/格式化器
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");

        // 正向格式化
        String localDateTimeStr1 = dateTimeFormatter.format(localDateTime);
        // 2022-08-03 19:57:21 星期三 下午
        System.out.println(localDateTimeStr1);

        // 逆向格式化

        String localDateTimeStr = localDateTime.format(dateTimeFormatter);
        // 2022-08-03 19:58:07 星期三 下午
        System.out.println(localDateTimeStr);

        // 解析字符串时间
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateStr = "2022-10-03 19:59:56";
        // 解析当付钱字符串时间成为本地日期时间对象
        LocalDateTime localDateTime1 = LocalDateTime.parse(dateStr, dateTimeFormatter1);
        // 2022-10-03T19:59:56
        System.out.println(localDateTime1);
    }
}
