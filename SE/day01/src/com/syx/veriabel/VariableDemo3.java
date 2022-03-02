package com.syx.veriabel;

class test {
    /**
     * 注释
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(5);
    }

}


public class VariableDemo3 {


    /**
     * 注释
     *
     * @param args
     */
    public static void main(String[] args) {
        //    目标：掌握使用基本数据类型定义不同变量
        //    1、byte字节整型 占1个字节
        byte number = 98;


        //   byte number2 =128;

        //  2、short 短整型
        short money = 30000;
        // short money2 =30000000;

        // 3、int整型 默认的类型 占4个字节
        int i = 155112;
        // 4、long 长整型 占8个字节

        long lg = 13323232;
        // 定义long类型时候，默认是int类型，数据较大时会超出int 范围，
        // 需要在其后加  L/l
        long lg2 = 16516546464L;

        // 5 浮点型(小数)
        // 随便写一个小数，默认是double类型，需要在其后加上 F/f
        float score = 98.5F;

        double score2 = 999.99;

        // 7、char 字符类型

        char ch = 'a';
        char ch1 = '中';
        // char ch2 = '中国';

        // 8、boolean

        boolean re = true;
        boolean res = false;


    }
}
