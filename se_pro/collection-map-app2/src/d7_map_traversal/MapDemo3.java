package d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("Xiaomi", 20);
        maps.put("Iphone", 100);
        maps.put("Huawei", 10);
        maps.put("Iqoo", 30);
        maps.put("Vivo", 50);
        System.out.println(maps);

        System.out.println("----------------");
        maps.forEach((key, value) -> System.out.println(key + ": " + key));

    }
}
