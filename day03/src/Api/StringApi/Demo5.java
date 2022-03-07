package Api.StringApi;

import java.util.Arrays;
import java.util.Random;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("----------------");
        // 获取字符串长度

        String name = "cov中";
        System.out.println(name.length());
        System.out.println("----------------");

        // 获取某个索引出的字符
        char c = name.charAt(2);
        System.out.println(c);
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        System.out.println("----------------");

        // 字符串转为字符数组
        char[] chars = name.toCharArray();
        for (char ch : chars) {
            System.out.println(ch);
        }
        System.out.println("----------------");

        // 截取内容（切片）
        String s2 = "大哥大嫂过年好！";
        System.out.println(s2.substring(1));
        System.out.println(s2.substring(1, 3));

        System.out.println("----------------");

        // 替换
        String s3 = s2.replace("年好", "oppp");
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("----------------");
        // 判断是否包含

        boolean s4 = s2.contains("大哥");
        System.out.println(s2);
        System.out.println(s4);
        System.out.println("----------------");

        // 以** 开始
        System.out.println(s2.startsWith("大哥"));
        System.out.println(s2.startsWith("大"));

        System.out.println("----------------");

        // 字符串切割
        String s5 = "Jinx,Lissa,Marry";
        String[] s = s5.split(",");
        for (String value : s) {
            System.out.println(value);
        }
        System.out.println("----------------");


    }
}
