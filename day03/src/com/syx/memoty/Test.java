package com.syx.memoty;


public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.sex = '男';
        s1.hobby = "白嫖";
        s1.study();

        Student s2 = s1;
        // s2.name = "李四";
        // s2.sex = '男';
        // s2.hobby = "吃饭，睡觉，打豆豆";
        s2.name="李四";
        s2.study();
        s1.study();
    }

}
