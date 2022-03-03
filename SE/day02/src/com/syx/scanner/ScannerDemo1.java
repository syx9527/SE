package com.syx.scanner;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        // 导入键盘输入包
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();

        System.out.printf("您的年龄是：%n%s岁%n", age);

        System.out.println("请输入您的名字:");
        String name = sc.next();
        System.out.printf("欢迎%s----%s%n", name, age);
        System.out.printf("欢迎%s----%s%n", name, age);

    }
}
