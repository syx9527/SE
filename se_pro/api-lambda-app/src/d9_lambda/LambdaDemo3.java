package d9_lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

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


        win.setSize(400, 300);
        // 显示窗口
        win.setVisible(true);
    }
}
