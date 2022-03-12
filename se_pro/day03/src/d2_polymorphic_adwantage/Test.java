package d2_polymorphic_adwantage;


public class Test {

    public static void main(String[] args) {
        Animal tortoise = new Tortoise();
        go(tortoise);

        Animal dog = new Dog();
        go(dog);

        // dog.lookDoor();  // 多态下不能访问子类独有功能
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
