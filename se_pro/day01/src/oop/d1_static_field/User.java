package oop.d1_static_field;

public class User {
    public static int onlineNumber = 161;
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
        u1.onlineNumber++;
        System.out.println(onlineNumber);
        System.out.println("-----------");


        User u2 = new User();
        u2.name = "Lx";
        u2.age = 36;
        System.out.println(u2.age);
        System.out.println(u2.name);
        u2.onlineNumber++;
        System.out.println(onlineNumber);
        System.out.println("-----------");

    }
}
