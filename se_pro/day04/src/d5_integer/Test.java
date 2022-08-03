package d5_integer;

/**
 * 包装类：
 * 基本数据类型的对应引用类型
 * 实现了一切皆可对象
 * 后期集合和泛型不支持基本类型，只能使用包装类
 * ---------------------------
 * 包装类默认值 null，更加安全
 * 可以把基本类型的数据转换成字符串类型（用处不大）
 * 可以把字符串类型的数值转换成真实的数据类型（很有用）
 *
 * @author SYX
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 11;
        System.out.println(a);
        System.out.println(a1);

        //  自动装箱
        Integer a2 = a;

        // 自动拆箱
        Integer integer = 100;
        int integer1 = integer;

        double db = 99.5;
        Double db2 = db;
        double db3 = db2;
        System.out.println(db3);


        // int age = null;
        Integer age1 = null;

        System.out.println("--------------");

        // 1.包装类可以把基本类型的数据转换成字符串形式。
        Integer i3 = 23;
        String rs = i3.toString();
        System.out.println(rs + 1);

        String res = Integer.toString(i3);
        System.out.println(res + 1);

        // 可以直接+字符串得到字符串类型
        String res2 = i3 + "";
        System.out.println(res2 + 1);

        System.out.println("--------------");

        // 2.字符串类型的数值转换成真实的数据类型
        String number = "23";
        // int age = Integer.parseInt(number);
        int age = Integer.valueOf(number);
        System.out.println(age + 1);

        String number2 = "23";
        // double age2 = Double.parseDouble(number_);
        double age2 = Double.valueOf(number2);
        System.out.println(age2 + 1);

    }

}
