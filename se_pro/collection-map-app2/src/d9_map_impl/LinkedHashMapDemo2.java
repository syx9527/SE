package d9_map_impl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * 目标：认识Map体系的特点，按照键无序，不重复，无索引，值不做要求
 */
public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        // 1.创建一个MAP集合对象
        Map<String, Integer> maps = new LinkedHashMap<>();
        maps.put("鸿星尔克", 3);
        maps.put("Java", 1);
        maps.put("枸杞", 1);
        maps.put("Java", 100);
        maps.put(null, null);
        System.out.println(maps);


        new TreeSet<>();
    }
}
