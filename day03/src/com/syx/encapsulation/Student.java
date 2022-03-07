package com.syx.encapsulation;

public class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 200) {
            this.age = age;
        } else {
            System.out.println("The age error,should in0-200!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
