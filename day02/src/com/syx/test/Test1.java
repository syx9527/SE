package com.syx.test;

import java.util.Scanner;

/**
 * 需求：机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱
 * 按照如下规则计算机票价格：
 * 旺季[5-10月]:头等舱9折，经济舱8.5折
 * 淡季[11-12,1-4月]:头等舱7折，经济舱6.5折
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("机票原价");
        double money = sc.nextDouble();

        System.out.println("月份");
        int month = sc.nextInt();

        System.out.println("舱位");
        String type = sc.next();
        double newMoney;
        newMoney = calc(money, month, type);


        if (newMoney != -1) {
            System.out.printf("您的%s%s机票原价%s,最终价格为%S%n", month, type, money, newMoney);
        }
    }

    public static double calc(double money, int month, String type) {

        if (month >= 5 && month <= 10) {
            switch (type) {
                case "经济舱" -> money *= 0.85;
                case "头等舱" -> money *= 0.9;
                default -> {
                    System.out.println("您输入的舱位有误！");
                    return -1;
                }
            }
        } else if (month == 11 || month == 12 || (month >= 1 && month <= 4)) {
            switch (type) {
                case "经济舱" -> money *= 0.65;
                case "头等舱" -> money *= 0.7;
                default -> {
                    System.out.println("您输入的舱位有误！");
                    return money=-1;
                }
            }
        } else {
            System.out.println("您输入的月份有误！");
            return -1;
        }

        return money;
    }
}
