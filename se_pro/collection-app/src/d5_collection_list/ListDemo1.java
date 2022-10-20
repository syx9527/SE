package d5_collection_list;

import java.util.*;

/**
 * @author SYX
 */
public class ListDemo1 {
    public static void main(String[] args) {
        // 1.创建一个ArrayList集合对象
        // List：有序、可重复，有索引
        //  多态

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("MySql");
        list.add("Java2");
        list.add("MySql");
        System.out.println(list);

        // 2.在某个索引位置插入元素
        list.add(1, "Redis");
        System.out.println(list);

        // 3.根据索引删除元素，返回被删除的元素
        System.out.println(list.remove(1));
        System.out.println(list);

        // 4.根据索引获取元素：public E get(int index):返回集合中指定位置的元素
        System.out.println(list.get(2));
        // 5.修改指定索引位置处的元素：pulic E set(int index, E element),返回修改前的元素
        System.out.println(list.set(2, "Sql Server"));
        Map<Integer, ArrayList<Integer>> maps = new HashMap<>();
        ArrayList<Integer> s = new ArrayList<>();
        maps.getOrDefault(1,s);
        java.util.LinkedHashSet<Integer> KILL_PPID= new LinkedHashSet<>();


    }
}
