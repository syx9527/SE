package exam.second;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> s = new ArrayList<>();

        while (true) {
            String temp = input.nextLine().trim();

            if ("#".equals(temp)) {
                break;
            } else {
                s.add(temp);
            }
        }
        for (String i : s) {
            int res = 0;
            for (int j = 0; j < i.length(); j++) {
                if (i.charAt(j) != ' ') {
                    res += ((int) i.charAt(j) - 64) * (j + 1);
                }
            }

            System.out.println(res);
        }
    }
}
