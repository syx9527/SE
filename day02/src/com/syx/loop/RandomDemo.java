package com.syx.loop;


import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random a = new Random();

        for (int i = 1; i <= 5; i++) {
            int number = a.nextInt(2, 8);
            System.out.println(number);
        }


    }
}
