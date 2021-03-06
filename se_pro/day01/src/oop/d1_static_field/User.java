package oop.d1_static_field;

public class User {
    // 静态成员变量
    public static int onlineNumber = 161;
    // 实例成员变量
    private String name;
    private int age;

    public static void main(String[] args) {
        User.onlineNumber++;
        System.out.println(onlineNumber);

        System.out.println("-----------");
        // System.out.println(name);
        User u1 = new User();

        u1.name = "Lx";
        u1.age = 36;
        System.out.println(u1.age);
        System.out.println(u1.name);
        onlineNumber++;
        System.out.println(onlineNumber);
        System.out.println("-----------");


        User u2 = new User();
        u2.name = "Lx";
        u2.age = 36;
        System.out.println(u2.age);
        System.out.println(u2.name);
        onlineNumber++;
        System.out.println(onlineNumber);
        System.out.println("-----------");

    }
}
