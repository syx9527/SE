package d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 目标：明确Collection集合体系的特点
 *
 * @author 17447
 */
public class CollectionDemo1 {
    public static void main(String[] args) {

        // 有序，可重复，有索引
        Collection list = new ArrayList();
        list.add("Java");
        list.add("Mybatis");
        list.add("Java");
        list.add("Python");
        list.add(32);
        list.add(3.3);
        list.add(false);
        System.out.println(list);


        Collection set = new HashSet();
        set.add("Java");
        set.add("Mybatis");
        set.add("Java");
        set.add("Python");
        set.add(32);
        set.add(3.3);
        set.add(false);
        System.out.println(set);

        System.out.println("-------------");
        // 后面的String可以省略啦
        // Collection<String> list2 = new ArrayList<String>();
        Collection<String> list2 = new ArrayList<>();

        list2.add("OP");
        list2.add("JAVA");
        System.out.println(list2);

        System.out.println("-----------");
        Collection<Integer> list3 = new ArrayList<>();
        list3.add(23);
        list3.add(23);
        list3.add(233);
        System.out.println(list3);

        System.out.println("----------");
        Collection<Double> list4 = new ArrayList<>();
        list4.add(23.0);
        list4.add(23.);
        list4.add(233.);
        System.out.println(list4);
    }
}
