package com.syx.note;

class GetTwo {
    static String d(int num, int op) {
        String res = "";
        int a = 0;
        for (; num > 0; ) {
            a = num % op;
            num = num / op;
            res = "%s%s".formatted(a, res);
            // System.out.println(a);
        }

        return res;
    }
}


public class GetNote {
    public static void main(String[] args) {
        String res = GetTwo.d(8, 2);
        System.out.println(res);
    }

}
