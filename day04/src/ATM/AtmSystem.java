package ATM;

import java.util.ArrayList;
import java.util.Random;
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
                case 1: {
                    login(accounts, scanner);
                    break;
                }
                case 2: {
                    register(accounts, scanner);
                    break;
                }
                case 3: {
                    status = false;
                    break;
                }
                default: {
                    System.out.println("您输入的操作有误，请您重新输入！");
                    break;
                }
            }
        }
    }

    /**
     * 登录
     *
     * @param accounts 全部集合
     * @param scanner  输入
     */
    private static void login(ArrayList<Account> accounts, Scanner scanner) {

        System.out.println("========== 欢迎您进入黑心银行ATM系统--登录 ============");
        if (accounts.size() == 0) {
            System.out.println("对不起，当前系统中,无任何账户，请先开户，再来登录~~");
            return;
        }
                while (true) {
            System.out.println("请输入您的卡号");
            String cardId = scanner.next();
            Account account = getAccountByCardId(accounts, cardId);
            if (account == null) {
                System.out.println("系统中不存在该账号");
            } else {
                while (true) {
                    System.out.println("请输入您的密码");
                    String password = scanner.next();
                    if (!password.equals(account.getPassword())) {
                        System.out.println("欢迎，" + account.getUsername() + "先生/女士，进入系统，您的卡号是:" + account.getCardId());

                        // 登陆后的操作页面
                        showUserCommand(account);
                        return;

                    } else {
                        System.out.println("对不起，您输入的密码有误");
                    }
                }
            }
        }

    }

    private static void showUserCommand(Account account) {

    }

    private static void register(ArrayList<Account> accounts, Scanner scanner) {
        System.out.println("========== 欢迎您进入黑心银行ATM系统--注册 ============");
        Account account = new Account();
        System.out.println("请您输入您的姓名");
        String username = scanner.next();
        account.setUsername(username);
        boolean status = true;
        while (status) {
            System.out.println("请您输入您的账户密码：");
            String password_1 = scanner.next();
            System.out.println("请您再次确认的账户密码：");
            String password_2 = scanner.next();
            if (password_1.equals(password_2)) {
                account.setPassword(password_1);
                status = false;
            } else {
                System.out.println("对不起，您两次输入的密码不一致，请您重新输入！");
            }
        }
        System.out.println("请您输入您的账户每次限额：");
        double money = scanner.nextDouble();
        account.setQuotaMoney(money);
        String cardId = getAutoCardId(accounts);
        account.setCardId(cardId);
        accounts.add(account);
        System.out.println("恭喜您，" + username + "先生/女士，您开户成功，您的卡号是" + cardId);
    }

    /**
     * 为账户生成8位与其他账户不同的号码
     *
     * @param accounts 全部账户集合
     * @return 新的卡号
     */
    private static String getAutoCardId(ArrayList<Account> accounts) {

        Random random = new Random();
        boolean status = true;
        String cardId = null;
        while (status) {
            cardId = "";
            cardId += random.nextInt(9) + 1;
            for (int i = 0; i < 7; i++) {
                cardId += random.nextInt(10);
            }

            Account accountByCardId = getAccountByCardId(accounts, cardId);
            if (accountByCardId == null) {
                status = false;
            }
        }
        return cardId;


    }

    /**
     * 查看队列中有没有该卡号（根据卡号返回对象没有则空）
     *
     * @param accounts 全部账户集合
     * @param cardID   卡号
     * @return 用户对象/null
     */
    private static Account getAccountByCardId(ArrayList<Account> accounts, String cardID) {
        for (Account account : accounts) {
            if (account.getCardId().equals(cardID)) {
                return account;
            }
        }

        return null;
    }


}
