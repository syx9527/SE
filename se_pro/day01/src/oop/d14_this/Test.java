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
