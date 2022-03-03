package com.syx.operator;

import  java.lang.Math;

class MaxNumber {
    static int getMax(int a, int b) {


        return Math.max(a, b);

    }

    static int getMax(int a, int b, int c) {
        int res = getMax(a, b);

        return getMax(res, c);
    }
}

public class OperatorDemo4 {
    public static void main(String[] args) {
        double score = 98;
        String rs = score >= 60 ? "考试通过" : "挂科";
        System.out.println(rs);

        System.out.println("---------------");

        System.out.println(MaxNumber.getMax(10, 100));
        System.out.println("---------------");
        System.out.println(MaxNumber.getMax(100, 500, 300));
        System.out.println(MaxNumber.getMax(9, 300, 900));
    }


}
