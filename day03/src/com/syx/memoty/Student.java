package com.syx.memoty;

public class Student {
    String name;
    char sex;
    String hobby;

    public void setSex(char sex) {

        this.sex = sex;
    }

    public void study() {


        System.out.printf("姓名：%s 性别：%s 爱好：%s%n", name, sex, hobby);
    }
}
