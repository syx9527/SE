package com.syx.javabean;

public class Test {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("张三");
        u1.setHeight(163.1);
        u1.setMoney(1800);

        System.out.println(u1.getName());
        System.out.println(u1);

        User u2 = new User("李四",180,6000);
        System.out.println(u2);
    }
}
