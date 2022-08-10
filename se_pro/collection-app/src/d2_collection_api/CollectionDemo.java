package d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 目标：明确Collection集合体系的特点
 *
 * @author 17447
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // HashSet:添加的元素是无序、不重复、五索引的

        Collection<String> list = new ArrayList<>();

        // 1.添加元素，添加成功返回true
        list.add("Java");
        list.add("独孤求败");
        list.add("Java");
        list.add("HTMl");
        list.add("Mybatis");
        System.out.println(list);

        // 2.清空集合元素
        // list.clear();
        System.out.println(list);

        // 3.判断集合是否为空，为空返回true，反之false
        System.out.println(list.isEmpty());

        // 4.获取集合的大小
        System.out.println(list.size());

        // 5.判断集合是包含某个元素
        System.out.println(list.contains("python"));
        System.out.println(list.contains("Java"));

        // 6.删除某个元素；如果有多个重复元素默认删除最前面的一个
        list.remove("Java");

        System.out.println(list);

        // 7.b把集合转换成数组 [Java, 独孤求败, HTMl, Mybatis]
        Object[] o = list.toArray();
        System.out.println(Arrays.toString(o));

        System.out.println("---------------");
        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");

        Collection<String> c2 = new ArrayList<>();
        c2.add("赵敏");
        c2.add("周芷若");
        // 把c2中的所有元素 全部添加到c1中
        c1.addAll(c2);
        System.out.println(c1);


    }
}
