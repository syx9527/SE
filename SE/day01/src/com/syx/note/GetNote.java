package com.syx.note;

class GetTwo {
    static String d(int num) {
        String res = "";
        int a = 0;
        for (; num > 1; ) {
            a = num % 2;
            num = num / 2;

        }
        return res;
    }
}

public class GetNote {
    public static void main(String[] args) {
        String res = GetTwo.d(9);
        System.out.println(res);
    }

}
