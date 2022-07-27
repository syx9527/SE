package d3_final;

/*
    目标：了解final中一些基本语法知识
 */
public class Test {
    public static final String SCHOOL_NAME = "昆明理工大学";
    private final String name = "张三";

    public static void main(String[] args) {
        // SCHOOL_NAME = "云南师范大学";

        Test t = new Test();
        // t.name = "sss";

        Cat cat = new Cat();
        cat.run();
        final int age;
        age = 12;
        // age = 46;
        final double pai = 3.14;
        buy(0.8);
    }

    public static void buy(final double z) {
        // z = 0.1;
        System.out.println(z);
    }
}

/**
 * final 修饰的类，不允许被继承
 */
class Animal {
    public void run() {
        System.out.println("跑");
    }
}

class Cat extends Animal {
    @Override
    public void run() {
        super.run();
        System.out.println("快跑！");

    }
}
