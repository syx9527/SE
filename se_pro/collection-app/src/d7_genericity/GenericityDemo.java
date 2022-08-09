package d7_genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标：泛型的概述
 * 什么是泛型？
 * --泛型就是一个标签: <数据类型>
 * --泛型可以在编译阶段约束只能操作某某中数据类型
 *
 * @author SLJ
 */
public class GenericityDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("op");

        List<Object> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("op");
        list1.add(23.3);
        list1.add(false);
        list1.add("my");

    }
}
