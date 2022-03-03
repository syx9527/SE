package com.syx.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 双色球：生成随机7个数
 * 要求：
 * 前6位（1-33）不能重复
 * 第7位（1-13）
 */
public class Test7 {
    public static void main(String[] args) {
        int n = 7;
        int[] luckNumber = createLuckNumber(n);
        int[] number = writerNumber(n);


        System.out.println("本次幸运号码为：");
        System.out.println(Arrays.toString(luckNumber));
        System.out.println("您所猜的号码为：");
        System.out.println(Arrays.toString(number));

        int[] arr = judge(luckNumber, number);
        int redHitNumbers = arr[0];
        int blueHitNumbers = arr[1];

        System.out.println("红球中奖数量为：" + redHitNumbers);
        System.out.println("蓝球中奖数量为：" + blueHitNumbers);
        int money = money(redHitNumbers, blueHitNumbers);
        if (money > 0) {
            System.out.printf("恭喜您，本次中奖%s元！%n", money);
        } else {
            System.out.println("谢谢惠顾！");
        }


    }


    public static int[] createLuckNumber(int n) {
        int[] arr = new int[n];
        Random r = new Random();

        for (int i = 0; i < arr.length - 1; i++) {

            while (true) {
                boolean res = true;
                int data = r.nextInt(33) + 1;
                for (int j = 0; j < i; j++) {
                    if (data == arr[j]) {
                        res = false;
                        break;
                    }
                }
                if (res) {
                    arr[i] = data;
                    break;
                }
            }

        }
        arr[n - 1] = r.nextInt(13) + 1;
        return arr;
    }

    public static int[] writerNumber(int n) {
        int[] arr = new int[n];
        // Random r = new Random();
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("请您输入您第" + (i + 1) + "位数字数字（1-33）");
            while (true) {
                boolean res = true;
                int data = sc.nextInt();
                for (int j = 0; j < i; j++) {
                    if (data == arr[j]) {
                        res = false;
                        System.out.println("不能重复,请您重新输入（1-33）！");
                        break;
                    }
                }
                if (data < 1 || data > 33) {
                    res = false;
                    System.out.println("输入有误，请您重新输入（1-33）！");
                }
                if (res) {
                    arr[i] = data;
                    break;
                }
            }
        }

        System.out.println("请您输入您第" + n + "位数字数字（1-13）");
        while (true) {
            int data = sc.nextInt();
            if (data < 1 || data > 13) {
                System.out.println("输入有误，请您重新输入（1-13）！");
            } else {
                arr[n - 1] = data;
                break;
            }
        }
        return arr;
    }

    public static int[] judge(int[] luckNumber, int[] number) {
        int redHitNumbers = 0;
        int blueHitNumbers;

        for (int i = 0; i < luckNumber.length - 1; i++) {
            for (int j = 0; j < number.length - 1; j++) {
                if (luckNumber[i] == number[j]) {
                    redHitNumbers++;
                }
            }
        }
        blueHitNumbers = (luckNumber[luckNumber.length - 1] == number[number.length - 1]) ? 1 : 0;


        return new int[]{redHitNumbers, blueHitNumbers};
    }

    public static int money(int redHitNumbers, int blueHitNumbers) {
        int money = 0;
        if (blueHitNumbers == 1 && redHitNumbers < 3) {
            money = 5;
        } else if (blueHitNumbers == 1 && redHitNumbers == 3 || blueHitNumbers == 0 && redHitNumbers == 4) {
            money = 10;
        } else if (blueHitNumbers == 4 && redHitNumbers == 1 || blueHitNumbers == 5 && redHitNumbers == 0) {
            money = 200;
        } else if (blueHitNumbers == 5 && redHitNumbers == 1) {
            money = 3000;
        } else if (blueHitNumbers == 6 && redHitNumbers == 0) {
            money = 500 * 10000;
        } else if (blueHitNumbers == 6 && redHitNumbers == 1) {
            money = 1000 * 10000;
        }

        return money;
    }
}
