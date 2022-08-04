package d9_lambda;

import javax.swing.*;
import java.util.Arrays;

/**
 * @author 17447
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer[] ages = {34, 12, 42, 23};
        Arrays.sort(ages, (o1, o2) -> o1 - o2);
        System.out.println(Arrays.toString(ages));

        System.out.println("---------------");

        JFrame win = new JFrame("登陆界面");
        JButton btn = new JButton("按钮很大，你忍一下");
        btn.addActionListener(e -> System.out.println("你点煤气罐啊！"));

        win.add(btn);
        win.setSize(400, 300);
        // 显示窗口
        win.setVisible(true);
    }
}
