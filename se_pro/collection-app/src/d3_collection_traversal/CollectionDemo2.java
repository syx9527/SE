package d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;

/**
 * for each增强for循环遍历集合
 *
 * @author SYX
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("岳不群");
        list.add("岳灵珊");
        list.add("林平之");
        list.add("宁中则");
        list.add("华山四姐妹");
        System.out.println(list);

        for (String temp : list) {
            System.out.println(temp);
        }

        System.out.println("------------------");
        double[] scores = {100, 99.5, 59.5};

        for (double score : scores) {
            System.out.println(score);
        }

    }
}
