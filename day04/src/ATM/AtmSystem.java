package ATM;

import java.util.ArrayList;
import java.util.Scanner;

public class AtmSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("561201", "林青霞", "张柏芝", 6000, 5000));
        accounts.add(new Account("561202", "林青霞", "张柏芝", 6000, 5000));
        accounts.add(new Account("561203", "林青霞", "张柏芝", 6000, 5000));
        System.out.println("==========欢迎您进入黑心银行ATM系统============");
        boolean status = true;
        while (status) {
            System.out.println("1、登录账户");
            System.out.println("2、注册账户");
            System.out.println("3、退出");
            System.out.println("请选择您的操作");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            switch (command) {
                case 1 -> login(accounts, scanner);
                case 2 -> register(accounts, scanner);
                case 3 -> status = false;
                default -> System.out.println("您输入的操作有误，请您重新输入！");
            }
        }
    }

    private static void register(ArrayList<Account> accounts, Scanner scanner) {
    }

    private static void login(ArrayList<Account> accounts, Scanner scanner) {

    }
}
