package d9_lambda;

/**
 * 目标：学会使用Lambda的标准使用方式，简化内部类的代码形式
 *
 * @author 17447
 */
public class LambdaDemo1 {
    public static void main(String[] args) {


        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("乌龟跑不了");
            }
        };
        a.run();

        System.out.println("---------------");

        /*
        Animal a1=()-{
                System.out.println("乌龟跑不了");
        }
        */

    }
}

/**
 * 动物
 */
abstract class Animal {
    /**
     * 跑
     */
    public abstract void run();
}