package d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合遍历
 * 迭代器
 * iterator
 *
 * @author SYX
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        Collection<String> list1 = new ArrayList<>();
        list.add("岳不群");
        list.add("岳灵珊");
        list.add("林平之");
        list.add("宁中则");
        list.add("华山四姐妹");
        System.out.println(list);
        // 获取迭代器对象
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
