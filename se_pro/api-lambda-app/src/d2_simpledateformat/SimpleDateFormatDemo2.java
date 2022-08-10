package d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 案例：请计算出2021年08月06日11点11分11秒，往后走2天14小时49分06秒后的时间是多少
 *
 * @author 17447
 */
public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {

        // 解析字符串时间成为时间对象
        // 2021年08月06日11点11分11秒
        String dateStr = "2021年08月06日 11:11:11";

        // 把时间字符串解析成日期对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = simpleDateFormat.parse(dateStr);
        // 往后走2天14小时49分06秒
        long time = d.getTime() + (2L * 24 * 60 * 60 + 14 * 60 * 60 + 49 * 60 + 6) * 1000;
        // 格式化这个时间毫秒值
        System.out.println(simpleDateFormat.format(time));
    }
}
