package oop.d13_extens_constructor2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("张三", 16, "高一3班");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getClassName());
    }
}
