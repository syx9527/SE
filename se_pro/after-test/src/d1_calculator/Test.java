package d1_calculator;

import javax.swing.*;

/**
 * Java版图形界面计算器
 *
 * @author SYX
 */
public class Test {
    public static void main(String[] args) {

        // 创建一个 JFrame 对象并初始化。JFrame 可以理解为程序的主窗体。
        JFrame frame = new JFrame("Calculator");

        // 设置主窗口出现在屏幕上的位置
        frame.setLocation(300, 200);

        // 设置窗体不能调大小
        frame.setResizable(false);


        // 创建一个 JTextField 对象并初始化。 JTextField 是用于显示操作和计算结果的文本框。
        // 参数 20 表明可以显示 20 列的文本内容
        // JTextField resultTextField = new JTextField(result, 20);


    }
}
