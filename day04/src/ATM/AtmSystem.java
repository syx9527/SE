package ATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AtmSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("561201", "令狐冲", "123456", 50, 5000));
        accounts.add(new Account("561202", "东方不败", "123456", 200, 5000));
        accounts.add(new Account("561203", "谢颖颖", "123456", 2500, 5000));
        System.out.println("==========欢迎您进入黑心银行ATM系统============");


        while (true) {
            System.out.println("1、登录账户");
            System.out.println("2、注册账户");
            System.out.println("3、退出");
            System.out.println("请选择您的操作");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            switch (command) {
                case 1: {
                    // 登录
                    login(accounts, scanner);
                    break;
                }
                case 2: {
                    // 注册
                    register(accounts, scanner);
                    break;
                }
                case 3: {
                    // 退出
                    return;
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
                        // 密码错误
                        System.out.println("对不起，您输入的密码有误");
                    } else {
                        System.out.println("欢迎，" + account.getUsername() + "先生/女士，进入系统，您的卡号是:" + account.getCardId());

                        // 登陆后的操作页面
                        showUserCommand(accounts, scanner, account);
                        return;
                    }
                }
            }
        }

    }

    /**
     * 用户操作页面
     *
     * @param accounts 全部集合
     * @param scanner  输入
     * @param account  用户对象
     */
    private static void showUserCommand(ArrayList<Account> accounts, Scanner scanner, Account account) {
        while (true) {
            System.out.println("==========用户操作页面=============");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            System.out.println("请选择：");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    // 查询账户
                    showAccount(account);
                    break;
                case 2:
                    // 存款
                    depositMoney(account, scanner);

                    break;
                case 3:
                    // 取款
                    drawMoney(account, scanner);
                    break;
                case 4:
                    // 转账
                    transferMoney(accounts, account, scanner);
                    break;
                case 5:
                    // 修改密码
                    updatePassword(account, scanner);
                    return;
                case 6:
                    // 退出
                    System.out.println("退出成功，欢迎下次光临");
                    return;
                case 7:
                    // 注销账户

                    if (deleteAccount(accounts, account, scanner)) {
                        return;
                    } else {
                        break;
                    }

                default:
                    System.out.println("您输入的命令不正确！");
            }
        }
    }

    /**
     * 销户功能
     *
     * @param accounts 全部集合
     * @param account  当前用户
     * @param scanner  扫描器
     */
    private static boolean deleteAccount(ArrayList<Account> accounts, Account account, Scanner scanner) {
        System.out.println("您是要跑路吗？y/n");
        String rs = scanner.next();
        if ("Y".equalsIgnoreCase(rs)) {
            accounts.remove(account);
            System.out.println("您的账户销户成功！");
        } else {
            System.out.println("还算你识抬举！");
            return false;
        }
        System.out.println("已注销，欢迎下次光临");
        return true;
    }

    /**
     * 修改密码
     *
     * @param account 当前对象
     * @param scanner 扫描器
     */
    private static void updatePassword(Account account, Scanner scanner) {
        System.out.println("==========修改密码=============");
        while (true) {
            System.out.println("请您输入当前密码");
            String password = scanner.next();
            if (account.getPassword().equals(password)) {
                // 密码正确
                while (true) {
                    System.out.println("请您输入新密码");
                    String password_1 = scanner.next();
                    System.out.println("请您确认新密码");
                    String password_2 = scanner.next();
                    if (password_1.equals(password_2)) {
                        if (password_1.equals(account.getPassword())) {
                            System.out.println("新密码不能与旧密码一致！");
                        } else {
                            account.setPassword(password_1);
                            System.out.println("恭喜您，密码修改成功！");
                            return;
                        }
                    } else {
                        System.out.println("两次密码不一致！");
                    }
                }
            } else {
                System.out.println("密码错误！");
            }
        }

    }

    /**
     * 用户转账
     *
     * @param accounts 全部集合
     * @param account  当前转账对象
     * @param scanner  扫描器
     */
    private static void transferMoney(ArrayList<Account> accounts, Account account, Scanner scanner) {
        System.out.println("==========用户转账=============");
        // 判断全部账户是否足够两个账户
        if (accounts.size() < 2) {
            System.out.println("当前系统中不存在两个账户，不能进行转账，请先去开户吧");
            return;
        }
        if (account.getMoney() == 0) {
            System.out.println("你没钱转个der！");
            showAccount(account);
            return;
        }

        while (true) {
            System.out.println("请您输入对方卡号");
            String nextCardId = scanner.next();
            if (nextCardId.equals(account.getCardId())) {
                System.out.println("您不能给自己转账！");
                System.out.println("您想左脚蹬右脚上天吗？");
                continue;
            }
            Account toAccount = getAccountByCardId(accounts, nextCardId);
            if (toAccount == null) {
                System.out.println("对不起，您输入的卡号有误，请您重新输入");

            } else {
                String username = toAccount.getUsername();
                String tip = "*" + username.substring(1);

                System.out.println("请您输入[" + tip + "]的姓氏");
                String toTipName = scanner.next();

                if (toAccount.getUsername().startsWith(toTipName)) {
                    // 认证通过，开始转账
                    while (true) {
                        System.out.println("请您输入转账金额");
                        double money = scanner.nextDouble();
                        if (money > account.getMoney()) {
                            System.out.println("您的余额不足");
                            showAccount(account);
                        } else {
                            account.setMoney(account.getMoney() - money);
                            toAccount.setMoney(toAccount.getMoney() + money);
                            return;
                        }
                    }
                } else {
                    System.out.println("对不起，您输入的信息有误！");
                }
            }
        }
    }

    /**
     * 存钱
     *
     * @param account 当前用户对象
     * @param scanner 扫描器
     */
    private static void depositMoney(Account account, Scanner scanner) {
        System.out.println("==========用户存钱=============");
        System.out.println("请您输入存款金额");
        double money = scanner.nextDouble();

        // 更新账户余额
        account.setMoney(account.getMoney() + money);
        showAccount(account);
    }

    /**
     * 取钱功能
     *
     * @param account 当前登录对象
     * @param scanner 扫描器
     */

    private static void drawMoney(Account account, Scanner scanner) {
        System.out.println("==========用户取钱钱=============");

        if (account.getMoney() < 100) {
            System.out.println("对不起，当前账户余额不足100.00元，不能进行取款！");
            showAccount(account);
            return;
        }
        while (true) {

            System.out.println("请您输入取款金额");
            double money = scanner.nextDouble();
            if (money > account.getQuotaMoney()) {
                System.out.println("对不起，您当前取款超过单词限额" + account.getQuotaMoney());

            } else {
                if (money > account.getMoney()) {
                    System.out.println("余额不足，当前总余额是" + account.getMoney() + "元");
                } else {
                    System.out.println("恭喜您，取款" + money + "元成功！");
                    // 更新账户余额
                    account.setMoney(account.getMoney() - money);
                    showAccount(account);
                    return;
                }
            }
        }
    }

    /**
     * 展示用户信息
     *
     * @param account 用户对象
     */
    private static void showAccount(Account account) {
        System.out.println("==========当前用户信息如下=============");
        String op = "";
        if (account.getMoney() > 1000) {
            op = "(土豪)";
        } else if (account.getMoney() < 100) {
            op = "(穷鬼)";
        }
        System.out.println("卡号：\t" + account.getCardId());
        System.out.println("姓名：\t" + account.getUsername() + op);
        System.out.println("余额：\t" + account.getMoney());
        System.out.println("单词限额：" + account.getQuotaMoney());
    }

    /**
     * 用户注册操作
     *
     * @param accounts 所有用户对象
     * @param scanner  扫描器
     */
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
