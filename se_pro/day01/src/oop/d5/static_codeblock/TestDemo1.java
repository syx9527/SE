package oop.d5.static_codeblock;

public class TestDemo1 {
    public static String schoolName;

    /**
     * 与类一起加载，自动触发，优先执行一次
     * 作用：可以在程序加载时进行静态数据的初始化操作（准备内容）
     */
    static {
        System.out.println("-----静态代码块被触发执行-----");
        schoolName = "昆明理工大学";

    }

    public static void main(String[] args) {
        // 目标：学习代码块的特点，基本作用
        System.out.println("-----main方法被触发执行-----");
        System.out.println(schoolName);
    }
}
