package d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Lambda表达式遍历
 *
 * @author SYX
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("岳不群");
        list.add("岳灵珊");
        list.add("林平之");
        list.add("宁中则");
        list.add("华山四姐妹");
        System.out.println(list);

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("------------");

        list.forEach(s -> System.out.println(s));

        System.out.println("------------");

        list.forEach(System.out::println);

    }
}
