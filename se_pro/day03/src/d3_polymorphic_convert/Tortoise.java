package d3_polymorphic_convert;

/**
 * @author 17447
 */
public class Tortoise extends Animal {
    public String name = "乌龟";

    @Override
    public void run() {
        System.out.println("🐢你跑个der~");
    }

    public void layEggs() {
        System.out.println("🐢在下蛋");
    }
}
