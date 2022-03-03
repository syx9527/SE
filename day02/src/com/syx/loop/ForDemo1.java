package com.syx.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.printf("学习Java的第%s天%n", i);
        }
        System.out.println(sum);
    }
}
