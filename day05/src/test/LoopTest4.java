package test;

import java.util.Scanner;

/**
 * 优化 test3
 *
 * @author icas-tt
 */
public class LoopTest4 {
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
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                System.out.println(i);
                return false;
            }
        }
        return true;
    }
}
