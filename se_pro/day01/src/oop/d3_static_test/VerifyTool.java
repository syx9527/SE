package oop.d3_static_test;

import java.util.Random;

public class VerifyTool {
    /**
     * 私有构造器
     */
    private VerifyTool() {
    }

    /**
     * create randomCode
     *
     * @param n length
     * @return code
     */
    public static String createCode(int n) {
        String s = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(s.length());
            code += s.charAt(index);
        }
        // System.out.println("验证码是" + code);
        return code;
    }


}
