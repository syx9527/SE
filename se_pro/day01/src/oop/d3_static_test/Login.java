package oop.d3_static_test;

import java.util.Random;

public class Login {
    public static void main(String[] args) {

        System.out.println("验证码是" + VerifyTool.createCode(5));
    }
}
