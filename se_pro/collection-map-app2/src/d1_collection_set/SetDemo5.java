package d1_collection_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 目标：观察TreeSet对于有值特性的数据如何排序
 * -    学会自定义类型对象进行指定规则排序
 */
public class SetDemo5 {

    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();// 不重复，无索引，可排序

        sets.add(23);
        sets.add(24);
        sets.add(12);
        sets.add(8);
        System.out.println(sets);

        Set<String> sets1 = new TreeSet<>();// 不重复，无索引，可排序

        sets1.add("Java");
        sets1.add("Python");
        sets1.add("angla");
        sets1.add("黑马");
        sets1.add("About");
        sets1.add("OBJ");
        sets1.add("UI");
        sets1.add("UI");

        System.out.println(sets1);

        System.out.println("--------------");

        // 需要给排序规则
        // Set<Apple> apples = new TreeSet<>((o1, o2) -> {
        //
        //     // return o2.getWeight() - o1.getWeight() ;// 按照重量降序
        //
        //     // 注意：浮点型直接使用 Double.compare(double d1, double d2)进行排序比较
        //     return Double.compare(o2.getPrice(), o1.getPrice());// 按照价格降序
        // });
        //                                       ↓
        //                                       ↓
        //                                       ↓
        //                                       ↓

        Set<Apple> apples = new TreeSet<>((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));

        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples.add(new Apple("绿苹果", "青色", 29.8, 400));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 500));
        apples.add(new Apple("黄苹果", "黄色", 9.9, 500));

        System.out.println(apples);
    }
}
