package Api.StringApi;

import java.util.Random;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        /* user:root,password:pp56 */
        String okUser = "root";
        String okPassword = "pass";
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名");
        String user = sc.next();

        System.out.println("请输入密码");
        String password = sc.next();

        System.out.println(user == okUser);
        System.out.println(password == okPassword);
        System.out.println("-----------------");
        System.out.println(user.equals(okUser));
        System.out.println(password.equals(okPassword));


    }
}
