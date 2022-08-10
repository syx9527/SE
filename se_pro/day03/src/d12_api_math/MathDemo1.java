package d12_api_math;

/**
 * Math类常用方法
 *
 * @author 17447
 */
public class MathDemo1 {
    public static void main(String[] args) {

        // 绝对值
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-3.2));

        // 向上取整
        System.out.println(Math.ceil(4.0000000000001));
        System.out.println(Math.ceil(4.0000000000000));

        // 向下取整
        System.out.println(Math.floor(5.3));

        // 求指数次方
        System.out.println(Math.pow(2, 3));

        // 四舍五入
        System.out.println(Math.round(4.23));
        System.out.println(Math.round(4.5));

        // 0.0-1.0 之间随机数
        System.out.println(Math.random());


        // 生成6.0-9.0之间的随机数
        System.out.println(6 + 3 * Math.random());
    }
}
