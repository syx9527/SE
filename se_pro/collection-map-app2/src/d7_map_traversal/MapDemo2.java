package d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("Xiaomi", 20);
        maps.put("Iphone", 100);
        maps.put("Huawei", 10);
        maps.put("Iqoo", 30);
        maps.put("Vivo", 50);
        System.out.println(maps);

        System.out.println("----------------");

        Set<Map.Entry<String, Integer>> entries = maps.entrySet();

        // 开始遍历
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
        System.out.println("----------------");


    }
}
