package d8_innerclass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 目标：同故宫GUI编程，理解匿名内部类的真实使用场景
 *
 * @author 17447
 */
public class Test3 {
    public static void main(String[] args) {

        // 1.创建窗口
        JFrame win = new JFrame("登陆界面");
        // 桌布
        JPanel panel = new JPanel();
        win.add(panel);

        // 2.创建一个按钮对象
        JButton btn = new JButton("登录");

        // 注意：讲解匿名内部类的使用
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "登录失败！"));

        // 3.把按钮对象添加至桌布展示
        panel.add(btn);

        // 4.展示


        win.setSize(400, 300);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
        win.show();

    }
}
