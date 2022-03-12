package d1_polymorphic;

/*
    目标：认识多态，理解多态的形式和概念
 */
public class Test {

    public static void main(String[] args) {
        // 1.多态的形式： 父类类型 对象名称 = new 子类构造器;
        Animal d = new Dog();
        d.run();  // 编译看左边，运行看右边
        System.out.println(d.name);  // 对变量的调用,编译看左边，运行看左边


        Animal t = new Tortoise();
        t.run(); // 编译看左边，运行看右边
        System.out.println(t.name); // 对变量的调用,编译看左边，运行看左边

    }

}
