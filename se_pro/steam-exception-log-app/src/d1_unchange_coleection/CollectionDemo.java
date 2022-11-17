package d1_unchange_coleection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 目标：创建不可变集合
 *
 * @author SYX
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // 1.不可变的List集合
        // jdk8不支持
        List<Double> lists = List.of(569.3, 700.5, 523.0, 570.5);

        // 可以获取值
        double source = lists.get(1);

        // lists.add(689.3);  // 不可添加
        // lists.set(2, 683.3);// 不可修改值
        System.out.println(lists);

        // 2.不可变的Set集合
        Set<String> names = Set.of("Yasuo", "Yong", "XinZhao", "leen");
        // names.add("garen");// 不允许添加
        System.out.println(names);

        // 3.不可便的Map集合
        Map<String, Integer> maps = Map.of("XiaoMI", 2, "java开发", 1, "劳力士", 5);
        System.out.println(maps);



    }
}
