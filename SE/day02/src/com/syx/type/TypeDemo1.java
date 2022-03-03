package com.syx.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        // 目标：小范围的变量自动转换为范围大的变量
        byte a = 20;
        int b = a;
        System.out.println(a);
        System.out.println(b);

        int age = 22;
        double bd = age;
        System.out.println(bd);

        char ch = '大';  // 00000000 01100001
        int code = ch;  // 00000000 00000000 00000000  01100001
        System.out.println(ch);
        System.out.println(code);
    }
}
