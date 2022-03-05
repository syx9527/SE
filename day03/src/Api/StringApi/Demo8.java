package Api.StringApi;

import java.util.Scanner;

/* 183****4561 */

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的手机号：");
        String phone = sc.next();

        String result = "%s****%s".formatted(phone.substring(0, 3), phone.substring(7));
        System.out.println(result);

    }
}
