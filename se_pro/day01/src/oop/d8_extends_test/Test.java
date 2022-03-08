package oop.d8_extends_test;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("小王吧");
        student.setAge(23);
        student.setClassName("大数据171");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getClassName());
        student.queryCourse();
        student.writeInfo();
    }
}
