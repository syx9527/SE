package d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 判断用户是否在秒杀时间段内
 * 2020-11-11 00:00:00
 * 2020-11-11 00:10:00
 *
 * @author 17447
 */
public class SimpleDateFormatTest3 {
    public static void main(String[] args) throws ParseException {
        // 开始、结束时间
        String startTime = "2020-11-11 00:00:00";
        String endTime = "2020-11-11 00:10:00";

        // 小贾、小皮
        String xiaoJia = "2020-11-11 00:03:47";
        String xiaoPi = "2020-11-11 00:10:11";

        // 解析时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = simpleDateFormat.parse(startTime);
        Date d2 = simpleDateFormat.parse(endTime);
        Date d3 = simpleDateFormat.parse(xiaoJia);
        Date d4 = simpleDateFormat.parse(xiaoPi);

        if (d3.after(d1) && d3.before(d2)) {
            System.out.println("xiaoJia 成功");
        } else {
            System.out.println("xiaoJia 失败");
        }
        if (d4.after(d1) && d4.before(d2)) {
            System.out.println("xiaoPi 成功");
        } else {
            System.out.println("xiaoPi 失败");
        }

    }
}
