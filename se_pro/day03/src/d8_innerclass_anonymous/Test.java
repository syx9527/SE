package d8_innerclass_anonymous;

/**
 * 目标：学习匿名内部类的形式和特点
 *
 * @author 17447
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑得快");
            }
        };
        a.run();
    }
}

/**
 * 动物
 */
abstract class Animal {
    /**
     * 动物跑
     */
    public abstract void run();
}

// class Tiger extends Animal {
//
//     @Override
//     public void run() {
//         System.out.println("老虎跑得快!");
//     }
// }