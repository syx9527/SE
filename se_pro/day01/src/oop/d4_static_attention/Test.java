package oop.d4_static_attention;

public class Test {

    public static int onlineNumber;
    private String name;

    public static void getMax() {
        // 静态方法能访问静态成员
        // System.out.println(name);
        System.out.println(Test.onlineNumber);
        System.out.println(onlineNumber);


        // 静态方法不能出现this关键字
        // System.out.println(this.name);

    }

    public void run() {
        // 实例方法能直接访问静态成员，也可以访问实例成员
        System.out.println(Test.onlineNumber);
        System.out.println(onlineNumber);
        System.out.println(name);
        // 实例方法能直接访问静态方法，也可以访问实例方法
        sing();
        getMax();
        Test.getMax();
        // 实例方法能出现this关键字
        System.out.println(this.name);
    }

    public void sing() {

    }

    public static void inAdr() {
        System.out.println("women shi lue lue lue");
        // 静态方法不能访问实例对象
        // System.out.println(name);


    }

    public static void main(String[] args) {

    }
}
