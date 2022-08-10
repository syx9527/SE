package d10_api_objects;

import java.util.Objects;

/**
 * 目标：掌握Objects类的常用方法：
 * equals(Object a, Object b)
 * isNull(Object o)
 *
 * @author 17447
 */
public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = new String("SYX");
        // 留下隐患，空指针异常
        System.out.println(s1 == s2);

        // 更安全
        System.out.println(Objects.equals(s1, s2));

        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));
    }
}
