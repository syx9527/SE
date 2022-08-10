package d1_polymorphic;

/**
 * 目标：认识多态，理解多态的形式和概念
 */
public class Test {

    public static void main(String[] args) {
        // 1.多态的形式： 父类类型 对象名称 = new 子类构造器;
        Animal d = new Dog();
        d.run();  // 编译看左边，运行看右边
        // 对变量的调用,编译看左边，运行看左边
        System.out.println(d.name);


        Animal t = new Tortoise();
        t.run(); // 编译看左边，运行看右边
        // 对变量的调用,编译看左边，运行看左边
        System.out.println(t.name);

    }

}


abstract class Animal {
    public String name = "父类动物";

    public abstract void run();

}

class Tortoise extends Animal {
    public String name = "乌龟";

    @Override
    public void run() {
        System.out.println("🐢你跑个der~");
    }
}


class Dog extends Animal {
    public String name = "狗";

    @Override
    public void run() {
        System.out.println("狗🐕🐕，别跑！");
    }
}
