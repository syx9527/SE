package oop.d5_static_codeblock;

public class TestDemo2 {

    private final String name;

    /*
     * 属于对象的，与对象一起加载，自动触发一次
     * 作用：初始化实例对象
     */ {
        System.out.println("===实例代码块====");
        name = "张麻子";

    }

    public TestDemo2() {
        System.out.println("==构造器被触发执行==");
    }

    public static void main(String[] args) {
        // 目标：构造代码块
        TestDemo2 t1 = new TestDemo2();
        System.out.println(t1.name);
        TestDemo2 t2 = new TestDemo2();
        System.out.println(t2.name);

    }
}
