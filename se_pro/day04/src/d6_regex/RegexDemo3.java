package d6_regex;

import java.util.Scanner;

/**
 * 校验用户输入的手机号码，邮箱号码，身份证号码
 *
 * @author SYX
 */
public class RegexDemo3 {
    public static void main(String[] args) {
        checkPhone();
        checkEmail();
        checkTell();
    }

    public static void checkPhone() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入您的注册手机号码：");
            String phone = sc.next();
            if (phone.matches("1[3-9]\\d{9}")) {
                System.out.println("手机号码格式正确，注册完成");
                break;
            } else {
                System.out.println("手机号码格式错误");
            }
        }

    }

    public static void checkTell() {
        // 0871-645131
        // 010-654120
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入您的注册电话号码：");
            String tell = sc.next();
            if (tell.matches("0\\d{2,6}-?\\d{4,20}")) {
                System.out.println("电话号码格式正确，注册完成");
                break;
            } else {
                System.out.println("电话号码格式错误");
            }
        }

    }

    public static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入您的注册邮箱：");
            String email = sc.next();
            if (email.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
                System.out.println("邮箱格式正确，注册完成");
                break;
            } else {
                System.out.println("邮箱格式错误");
            }
        }

    }

}
