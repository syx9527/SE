package d4_jdk8_time;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author SYX
 */
public class Demo7Period {
    public static void main(String[] args) {
        //  当前本地 年月日
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // 生日的 年月日
        LocalDate birthDate = LocalDate.of(1998, 11, 20);
        System.out.println(birthDate.toString());

        Period period = Period.between(birthDate, today);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
