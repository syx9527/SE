package d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List 遍历
 *
 * @author SYX
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("MySql");
        list.add("Java2");
        list.add("MySql");
        System.out.println(list);
        System.out.println("---------------------");

        // for 循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------------");

        // 迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---------------------");

        // foreach
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        // Lambda表达式
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);

        System.out.println("---------------------");

    }
}
