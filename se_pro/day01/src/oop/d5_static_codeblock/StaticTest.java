package oop.d5_static_codeblock;


import java.util.ArrayList;

public class StaticTest {
    /*
        模拟初始化牌操作
        1.准备一个容器，存储54张牌对象，这个容器建议使用静态的集合，静态的集合只用加载一次。
     */


    static ArrayList<String> cards = new ArrayList<>();


    /*
    2.在游戏启动之前需要准备号54张牌，使用静态代码进行初始化
     */
    static {

        // 3.加载54张牌进去

        // 4.准备4种花色：类型确定，个数确定了
        String[] colors = {"♣", "♥", "♠", "♦"};

        // 5.定义点数
        String[] sizes = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        // 6.先遍历点数，再组合花色
        for (String color : colors) {
            for (String size : sizes) {
                cards.add(size + color);
            }
        }
        // 7.单独添加大小王
        // 大王
        cards.add("🚀");
        // 小王
        cards.add("✈");
    }

    public static void main(String[] args) {
        System.out.println(cards);
    }
}
