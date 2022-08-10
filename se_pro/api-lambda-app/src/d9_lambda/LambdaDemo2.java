package d9_lambda;

/**
 * @author 17447
 */
public class LambdaDemo2 {
    public static void main(String[] args) {

        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("乌龟游泳贼快");
            }
        };
        go(s1);

        System.out.println("------------");

        Swimming s2 = () -> {
            System.out.println("小兔子不会游泳");
            System.out.println("小兔子不会游泳");
        };
        go(s2);

        System.out.println("------------");

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("鸭子也会游泳");

            }
        });
        System.out.println("------------");

        go(() -> {
            System.out.println("鳄鱼也会游泳");
        });

    }

    public static void go(Swimming s) {
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}

/**
 * FunctionalInterface
 * 一旦加上这个注解，必须是函数式接口，里面只能有一个抽象方法
 */
@FunctionalInterface
interface Swimming {
    /**
     * 游泳
     */
    void swim();
}
