package oop.d2_static_method;

public class Student {
    private String name;
    private int age;

    /**
     * 实例方法，无static修饰，属于对象的，通常表示自己的行为，可以访问对象的成员变量
     */

    public void study() {
        System.out.println(name + "在学习！");
    }

    /**
     * 实例方法，有static修饰，属于类，可以被类和对象共享访问
     */
    public static void getMax(int a, int b) {
        System.out.println(a > b ? a : b);
    }


    public static void main(String[] args) {
        // 1.类名.静态方法
        Student.getMax(10, 20);
        getMax(20, 30);

        // 2.对象.实例方法
        // 会报错
        // stufy();
        Student s = new Student();
        s.name = "葛根";
        s.study();
        // 3.对象.静态方法(不推荐)
        s.getMax(50, 60);
    }
}
