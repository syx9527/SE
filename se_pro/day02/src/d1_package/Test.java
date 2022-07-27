package d1_package;


import d1_package.demo1.Animal;
import d1_package.demo1.Cat;

public class Test {
    public static void main(String[] args) {
        // 同一个包下面的类不需要导包
        Student student = new Student();
        //  不同包下面类必须导包才能使用
        Animal animal = new Animal();

        //通过导包使用Cat
        // d1_package.demo1.Cat
        Cat c1 = new Cat();
        c1.run();
        // 指定目录下的包
        d1_package.demo2.Cat c2 = new d1_package.demo2.Cat();
        c2.run();
    }
}
