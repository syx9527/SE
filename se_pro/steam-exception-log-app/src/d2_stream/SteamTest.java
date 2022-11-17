package d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 目标：初步体验Stream流的便捷
 *
 * @author SYX
 */
public class SteamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张强", "赵敏", "周芷若", "张无忌");
        names.add("");

        // 1.从集合中找出姓"张"的放到新集合中
        List<String> zhangList = new ArrayList<>();

        for (String name : names) {
            if (name.startsWith("张")) {
                zhangList.add(name);
            }
        }
        System.out.println(zhangList);

        // 2.找名称长度为3的姓名
        List<String> zhangTreeList = new ArrayList<>();
        for (String name : zhangList) {
            if (name.length() == 3) {
                zhangTreeList.add(name);
            }
        }
        System.out.println(zhangTreeList);

        // 3.使用Stream流实现
        names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
