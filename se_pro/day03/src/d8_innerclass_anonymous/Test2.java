package d8_innerclass_anonymous;

/**
 * 目标：掌握匿名内部类的使用形式（语法）
 *
 * @author 17447
 */
public class Test2 {
    public static void main(String[] args) {
        // Swimming s = new Student();
        // go(s);

        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生快乐游泳");
            }
        };
        go(s);
        System.out.println("------------");
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游得更快");
            }
        });
        System.out.println("------------");
        go(() -> System.out.println("运动员游得最快"));

    }

    /**
     * 学生 老师 运动员 都可以一起参加游泳比赛
     */
    public static void go(Swimming swimming) {
        System.out.println("开始……");
        swimming.swim();
        System.out.println("结束……");

    }
}

// class Student implements Swimming {
//     @Override
//     public void swim() {
//         System.out.println("学生快乐游泳");
//     }
// }

/**
 * 游泳
 */
interface Swimming {
    /**
     * 游泳
     */
    void swim();
}