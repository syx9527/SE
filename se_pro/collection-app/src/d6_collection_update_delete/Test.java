package d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 调试删除列表会出现的异常
 *
 * @author SLJ
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("mysql");
        list.add("MoGo");
        list.add("java");
        list.add("redis");
        list.add("java");

        list1.addAll(list);
        list2.addAll(list);
        list3.addAll(list);
        list4.addAll(list);
        System.out.println(list);

        //[java, python, mysql, MoGo, redis]

        System.out.println("----------------");


        // 需求：删除全部的java信息
        // a.迭代器遍历删除
        Iterator<String> it = list1.iterator();

        while (it.hasNext()) {
            String ele = it.next();
            if ("java".equals(ele)) {
                // list.remove("java");

                // 删除当前元素，并且不会后移
                it.remove();
            }
        }
        System.out.println(list1);


        // b.foreach遍历删除
        // Exception in thread "main" java.util.ConcurrentModificationException
        /*
        for (String s : list2) {
            if ("java".equals(s)) {
                list2.remove("java");
            }
        }
        */
        System.out.println(list2);
        System.out.println("----------------");
        // c.Lambda表达式
        // list3.forEach(s -> {
        //     if ("java".equals(s)) {
        //         list3.remove("java");
        //     }
        // });
        System.out.println("----------------");

        // d.for循环
        // 没有报错，但是会漏删，可以选择倒着删
        // [python, mysql, MoGo, redis, java]
        // for (int i = 0; i < list4.size(); i++) {
        //     String ele = list.get(i);
        //     if ("java".equals(ele)) {
        //         list4.remove("java");
        //     }
        // }
        for (int i = list4.size() - 1; i >= 0; i--) {
            String ele = list.get(i);
            if ("java".equals(ele)) {
                list4.remove("java");
            }
        }
        System.out.println(list4);
    }
}
