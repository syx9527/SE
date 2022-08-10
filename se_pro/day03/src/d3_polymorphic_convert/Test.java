package d3_polymorphic_convert;


/**
 * @author 17447
 */
public class Test {

    public static void main(String[] args) {
        Animal tortoise = new Tortoise();
        go(tortoise);

        Animal dog = new Dog();
        go(dog);

        // dog.lookDoor();  // 多态下不能访问子类独有功能

        // 父类类型到子类类型必须强制转换
        Tortoise t = (Tortoise) tortoise;
        t.layEggs();

        // 注意：如果转型后的类型和对象真实类型不是同一种类型的，那么在转换后就会出现ClassCastExcion
        // Dog d= (Tortoise) tortoise;

        // Java 建议强转类型前使用instanceof判断当前对象的真实类型，再进行强制转换
        if (dog instanceof Tortoise) {
            Tortoise t1 = (Tortoise) tortoise;
            t1.layEggs();
        } else {
            Dog d1 = (Dog) dog;
            d1.lookDoor();
        }

    }

    /**
     * 要求：所有的动物都可以进来比赛
     */
    public static void go(Animal animal) {
        System.out.println("开始~~");
        animal.run();
        System.out.println("结束~~");
    }

}
