package test;

import java.util.Scanner;

/**
 * 求质数
 * 键盘录入一个正整数，判断该整数是否为一个质数
 *
 * @author icas-tt
 */
public class LoopTest3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleaser enter number:");
        n = scanner.nextInt();
        System.out.printf("%s %s prime number", n, isPrime(n) ? "is" : "not");
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
