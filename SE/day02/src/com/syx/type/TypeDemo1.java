package com.syx.type;

public class TypeDemo1 {
    public static void main(String[] args) {
        // 目标：小范围的变量自动转换为范围大的变量
        byte a = 20;
        int b = a;
        System.out.println(a);
        System.out.println(b);
    }
}
