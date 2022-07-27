package oop.d13_extens_constructor2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三", 16, "高一3班");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getClassName());
    }
}


class Student extends People {
    private String className;
    private char sex;

    public Student() {
    }

    public Student(String name, int age, String className) {

        // 调用父类有参构造器
        super(name, age);

        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
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
