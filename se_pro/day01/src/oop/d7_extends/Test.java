package oop.d7_extends;

import oop.d6_singleinstance.SingleInstance1;

public class Test {
    public static void main(String[] args) {
        // 创建子类对象，试试看能不能调用父类的对象
        Student s = new Student();

        s.setName("张三");
        s.setAge(23);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.study();

        System.out.println("----------------");

        Teacher t = new Teacher();
        t.setName("罗翔");
        t.setAge(45);
        System.out.println(t.getName());
        System.out.println(t.getAge());
        t.teach();
    }
}
