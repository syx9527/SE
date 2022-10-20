package exam.first;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        float n = s.nextFloat();
        int i = 0;
        while (n > 0) {

            n -= 2 * (Math.pow(0.95, i));
            i += 1;
        }
        System.out.println(i);
    }
}
