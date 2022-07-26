package test;

/**
 * 平方根
 * 需求：
 * 键盘录入一个大于2的整数X,计算并返回X的平方根，
 * 结果只保留整数部分，小数部分将被舍去。
 *
 * @author icas-tt
 */
public class LoopTest2 {
    public static void main(String[] args) {
        int n = 90000999;
        int sqt = sqrtFor(n);
        System.out.println(sqt);
        System.out.println("---------------");
    }

    public static int sqrtFor(int n) {
        for (int i = 0; i < n; i++) {
            if (i * i <= n && (i + 1) * (i + 1) > n) {
                return i;
            }
        }
        return -1;
    }


}
