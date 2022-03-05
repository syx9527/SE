package Api.StringApi;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        String okLLoginName = "admin";
        String okpPassword = "123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入您的用户名：");
            String username = sc.next();

            System.out.println("请输入您的密码：");
            String password = sc.next();
            if (okLLoginName.equals(username)) {
                if (okpPassword.equals(password)) {
                    System.out.println("登录成功");
                    break;
                } else {
                    System.out.println("密码错误！");
                    System.out.printf("您还有%s次机会%n", 3 - i);
                }
            } else {
                System.out.println("用户名错误！");
                System.out.printf("您还有%s次机会%n", 3 - i);
            }
        }
    }
}
