package d14_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author SYX
 */
public class BigDecimalDemo {

    public static void main(String[] args) {
        // 浮点数运算的时候直接 +，-，*， /可能 会出现数据失真，（精度问题）

        System.out.println(0.09 + 0.01);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);
        System.out.println("--------------");

        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);
        System.out.println("--------------");

        // 包装浮点型数据为大数据对象 BigDecimal
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal a2 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(a2);
        // BigDecimal c1=a1.subtract(a2);
        // BigDecimal c1=a1.multiply(a2);
        // BigDecimal c1=a1.divide(a2);

        double res = c1.doubleValue();
        System.out.println(res);
        System.out.println("--------------");

        // 注意事项，BigDecimal一定要去完成精度运算
        BigDecimal a11 = BigDecimal.valueOf(10.0);
        BigDecimal b11 = BigDecimal.valueOf(3.0);
        /*
            参数一：除数
            参数二：保留小数位数
            参数三：舍入模式

         */
        BigDecimal c11 = a11.divide(b11, 2, RoundingMode.HALF_UP);
        System.out.println(c11);


    }
}
