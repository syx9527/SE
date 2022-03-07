package oop.demo1;

public class Test {
    public static void main(String[] args) {
        // 创建对象
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setSex('男');

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getSex());

        System.out.println("-------------");
        Student s2 = new Student("李四", 20, '女');
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSex());
        System.out.println("-------------");

    }
}
