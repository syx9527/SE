package com.syx.test;

import java.util.Random;

/*
    生成5位的验证码，可能包含数字，大、小写字母。
 */
public class Test3 {
    public static void main(String[] args) {
        int n = 6;
        String code = createCode(n);
        System.out.println(code);
    }

    public static String createCode(int n) {
        StringBuilder code = new StringBuilder();
        Random r = new Random();


        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            char ch;
            switch (type) {
                case 0 -> {
                    ch = (char) (r.nextInt(26) + 65);
                    code.append(ch);
                }
                case 1 -> {
                    ch = (char) (r.nextInt(26) + 97);
                    code.append(ch);
                }
                case 2 -> code.append(r.nextInt(10));
            }


        }

        return code.toString();


    }
}
