package d1_collection_set;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {

    public static void main(String[] args) {
        // 看看Set系列几个的特点
        Set<String> sets = new LinkedHashSet<>();
        sets.add("MySql");
        sets.add("MySql");
        sets.add("Java");
        sets.add("Java");
        sets.add("MTML");
        sets.add("MTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);
    }
}
