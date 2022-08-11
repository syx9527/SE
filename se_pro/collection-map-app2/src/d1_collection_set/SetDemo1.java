package d1_collection_set;

import java.util.HashSet;
import java.util.Set;

/**
 * Set系列集合特点
 * 无序：存取顺序不一致
 * 不重复：可以去除重复
 * 无索引：没有带索引的方法，所以不能使用普通for循环遍历，也不能通过索引来获取元素
 * ------------------------------
 * HashSet: 无序，不重复，无索引
 * LinkedHashSet:有序、不重复、无索引
 * TreeSet:排序、不重复、无索引
 * -----------------------------
 * Set集合的功能基本余Collection的API一致
 *
 * @author SLJ
 */
public class SetDemo1 {
    public static void main(String[] args) {
        // 看看Set集合的特点：HashSet，LinkedHashSet，TreeSet

        Set<String> sets = new HashSet<>();
        // Set<String> sets = new LinkedHashSet<>();
        // Set<String> sets = new TreeSet<>();
        sets.add("MySql");
        sets.add("MySql");
        sets.add("Java");
        sets.add("J");
        sets.add("Java");
        sets.add("J");
        sets.add("Html");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);
    }
}
