package com.syx.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        // 目标：输出三位数的 个、十、百位数字
        int data = 153;
        System.out.println(data % 10);
        System.out.println(data % 100/10);
        System.out.println(data /100 );
    }
}
