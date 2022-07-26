package test;

/**
 * 逢七过
 * 从任意一个数字开始报数，当你要报的数字包含7或者是7的倍数时都要说：过
 * 需求：使用程序在控制台打印出1-100之间的满足逢七规则的数据
 *
 * @author icas-tt
 */
public class LoopTest1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
