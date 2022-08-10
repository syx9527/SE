package d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

/**
 * @author 17447
 */
public class Demo4UpdateTime {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();

        System.out.println("当前时间: " + nowTime);

        System.out.println("1小时前: " + nowTime.minusHours(1));
        System.out.println("1分钟前: " + nowTime.minusMinutes(1));
        System.out.println("1分秒前: " + nowTime.minusSeconds(1));

        System.out.println("------------");

        System.out.println("1小时后: " + nowTime.plusHours(1));
        System.out.println("1分钟后: " + nowTime.plusMinutes(1));
        System.out.println("1分秒后: " + nowTime.plusSeconds(1));

        System.out.println("------------");

        LocalDate myDate = LocalDate.of(2008, 9, 5);
        LocalDate nowDate = LocalDate.now();

        System.out.println("今天是2020-8-3吗？ " + nowDate.equals(myDate));
        System.out.println(myDate + " 在 " + nowDate + "之" + (myDate.isBefore(nowDate) ? "前" : "后"));

        System.out.println("------------");

        // 判断今天是不是你的生日
        LocalDate birDate = LocalDate.of(1998, 11, 20);
        LocalDate nowDate1 = LocalDate.now();

        MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());

        // MonthDay nowMd = MonthDay.now();

        MonthDay nowMd = MonthDay.from(nowDate1);
        System.out.printf("今天%s是你的生日%n", birMd.equals(nowMd) ? "" : "不");
    }

}
