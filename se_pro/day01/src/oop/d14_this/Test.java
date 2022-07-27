package oop.d14_this;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("张武", "昆明理工大学");
        System.out.println(s1.getName());
        System.out.println(s1.getClassName());

        System.out.println("-----------");
        Student s2 = new Student("王超");
        System.out.println(s2.getName());
        System.out.println(s2.getClassName());


    }
}

class People {
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Student {
    private String className;
    private String name;
    // private int age;

    public Student() {
    }

    public Student(String name) {

        this(name, "云南师范大学");
    }


    public Student(String name, String className) {

        this.className = className;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
