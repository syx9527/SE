package d6_map_api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SLJ
 */
public class MapDemo {
    public static void main(String[] args) {

        // 1.添加元素：无序，不重复，无索引
        Map<String, Integer> maps = new HashMap<>();
        Map<String, Integer> maps1 = new HashMap<>();
        Map<String, Integer> maps2 = new HashMap<>();
        Map<String, Integer> maps3 = new HashMap<>();
        Map<String, Integer> maps4 = new HashMap<>();

        maps.put("Iphone", 10);
        maps.put("Xiaomi", 20);
        maps.put("Iphone", 100);
        maps.put("Huawei", 10);
        maps.put("Iqoo", 10);
        maps.put("Vivo", 10);
        maps1.putAll(maps);
        maps2.putAll(maps);
        maps3.putAll(maps);
        maps4.putAll(maps);
        System.out.println(maps);
        System.out.println(maps1);
        System.out.println("----------------");
        // 2.清空集合
        maps.clear();
        System.out.println(maps);
        System.out.println(maps1);
        System.out.println("----------------");
        // 3.判断集合是否为空，true or false
        System.out.println(maps.isEmpty());
        System.out.println(maps1.isEmpty());
        System.out.println("----------------");
        // 4.根据键获取对应值：
        Integer huaWei = maps1.get("Huawei");
        System.out.println(huaWei);
        System.out.println(maps1.get("Redmi"));
        System.out.println("----------------");
        // 5.根据键删除整个元素（会返回删除键的值）
        System.out.println(maps1);
        Integer xiaomi = maps1.remove("Xiaomi");
        System.out.println(xiaomi);
        System.out.println(maps1);
        System.out.println("----------------");
        // 6.判断是否包含某个键
        System.out.println(maps2.containsKey("xiaomi"));
        System.out.println(maps2.containsKey("Redmi"));
        System.out.println("----------------");
        // 7.判断是否包含某个值
        System.out.println(maps3.containsValue(10));
        System.out.println(maps3.containsValue(50));
        System.out.println("----------------");
        // 8.获取全部键的集合
        Set<String> strings = maps3.keySet();
        System.out.println(strings);
        System.out.println("----------------");
        // 9.获取全部值的集合
        Collection<Integer> values = maps4.values();
        System.out.println(values);
        System.out.println("----------------");
        // 10.集合的大小
        System.out.println(maps4.size());
        System.out.println("----------------");
        // 11.合并其他的的Map集合
        Map<String, Integer> maps5 = new HashMap<>();
        maps5.put("Huawei1", 1);
        maps5.put("Huawei2", 2);
        Map<String, Integer> maps6 = new HashMap<>();
        maps6.put("Huawei3", 3);
        maps6.put("Huawei4", 4);
        System.out.println(maps5);
        System.out.println(maps6);
        maps5.putAll(maps6);
        System.out.println(maps5);
        System.out.println(maps6);
        System.out.println("----------------");

    }
}
