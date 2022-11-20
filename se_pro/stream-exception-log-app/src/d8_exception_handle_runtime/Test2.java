package d8_exception_handle_runtime;

import java.util.Scanner;

/**
 * 需求
 * - 键盘录入一个合理的价格为止（必须是数值，值必须大于0）.
 * -----
 * 分析
 * - 定义一个死循环，让用户不断的输入价格。
 *
 * @author SYX
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入一个合法的价格：");
            String priceStr = scanner.nextLine();
            // 转换成double类型的价格
            double price = 0;
            try {
                price = Double.parseDouble(priceStr);
            } catch (NumberFormatException e) {
                // e.printStackTrace();
                System.out.println("您的输入有误！");
                continue;
            }
            // 判断是否大于0
            if (price > 0) {
                System.out.println("定价：" + price);
                break;
            } else {
                System.out.println("输入的价格必须时正数~~~");
            }
        }
    }
}
