package d9_map_impl;

import java.util.*;

/**
 * 需求
 * 某个班级80名学生，现在需要促成秋游活动，班长提供了四个景点一次是（A,B,C,D）,每个学生只能选择一个景点，请统计出哪个景点想去的人数最多。
 */
public class MapTest4 {
    public static void main(String[] args) {

        // 1.需求：程序继续每个学生选择的情况
        Map<String, List<String>> data = new HashMap<>();

        // 2.把学生选择的数据存入进去
        List<String> selects = new ArrayList<>();
        Collections.addAll(selects, "A", "C");
        data.put("罗勇", selects);
        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1, "B", "C", "D");
        data.put("胡桃", selects1);
        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2, "A", "B", "C", "D");
        data.put("刘军", selects2);
        System.out.println(data);

        // 3.统计每个景点选择的人数
        Map<String, Integer> infos = new HashMap<>();

        // 4.提取所有人选择的景点的信息
        Collection<List<String>> values = data.values();
        System.out.println(values);
        // values = [[B, C, D], [A, B, C, D], [A, C]]
        for (List<String> value : values) {
            for (String s : value) {
                if (infos.containsKey(s)) {
                    infos.put(s, infos.get(s) + 1);
                } else {
                    infos.put(s, 1);
                }
            }
        }
        System.out.println(infos);
    }
}
