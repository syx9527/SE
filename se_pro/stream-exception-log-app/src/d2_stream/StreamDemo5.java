package d2_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 目标：收集Stream流到集合/数组中去
 *
 * @author SYX
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张三丰");
        list.add("张强");
        list.add("张强");
        list.add("张三丰");
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        // 收集流到集合中去
        List<String> zhangList = s1.collect(Collectors.toList());
        System.out.println(zhangList);

        // 注意：流只能使用一次，后面再使用就会报错
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("张"));

        Set<String> zhangSet = s2.collect(Collectors.toSet());
        System.out.println(zhangSet);

        // 收集到数组中去
        Stream<String> s3 = list.stream().filter(s -> s.startsWith("张"));
        String[] arr = s3.toArray(String[]::new);
        System.out.println("arr：" + Arrays.toString(arr));

    }
}
