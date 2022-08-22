package d8_map_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 需求
 * 某个班级80名学生，现在需要促成秋游活动，班长提供了四个景点一次是（A,B,C,D）,每个学生只能选择一个景点，请统计出哪个景点想去的人数最多。
 */
public class Test {
    public static void main(String[] args) {
        //1.把80个学生选择的数据拿进来
        String[] selects = {"A", "B", "C", "D"};
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[random.nextInt(selects.length)]);
        }
        System.out.println(sb);

        // 定义一个Map集合记录统计结果
        Map<Character, Integer> infos = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (infos.containsKey(ch)) {
                infos.put(ch, infos.get(ch) + 1);

            } else {
                infos.put(ch, 1);
            }
        }

        System.out.println(infos);
    }
}
