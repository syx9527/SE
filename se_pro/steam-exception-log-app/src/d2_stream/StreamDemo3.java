package d2_stream;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标：掌握常用Stream流API
 * | 名称                                            | 说明                                         |
 * | ----------------------------------------------- | -------------------------------------------- |
 * | Stream<T> filter(Predicate< ? super T> predicate) | 对于六种的数据进行过滤                  |
 * | Stream<T> limit(long maxSize)                   | 获取前几个元素                               |
 * | Stream<T> skip(long n)                          | 跳过前几个元素                               |
 * | Stream<T> distinct()                            | 去除流中重复元素。以来(hashCode和equals)方法 |
 * | static <T> Stream<T>  concat(Stream a,Stream b) | **合并**a和b连个流为一个流                   |
 *
 * @author SYX
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张三丰");
        list.add("张强");
        list.add("张强");
        list.add("张三丰");

        // Stream<T> filter(Predicate<? super T> predicate);
        // list.stream().filter(new Predicate<String>() {
        //     @Override
        //     public boolean test(String s) {
        //         return s.startsWith("张");
        //     }
        // });
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

        long size = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(size);
    }
}
