package d1_polymorphic;

/*
    目标：认识多态，理解多态的形式和概念
 */
public class Test {
    public static void main(String[] args) {
        // 1.多态的形式： 父类类型 对象名称 = new 子类构造器;
        Animal d = new Dog();
        d.run();

        Animal t = new Tortoise();
        t.run();
    }

}
