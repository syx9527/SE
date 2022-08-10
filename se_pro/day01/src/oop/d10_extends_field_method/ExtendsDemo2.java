package oop.d10_extends_field_method;

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.run();
        System.out.println("--------------");
        s.go();
    }
}


class People {
    public String name;

    public void run() {
        System.out.println("人可以跑");
    }
}

class Student extends People {
    public void run() {
        System.out.println("学生可以跑");
    }

    public void go() {
        run();
        super.run();
    }
}