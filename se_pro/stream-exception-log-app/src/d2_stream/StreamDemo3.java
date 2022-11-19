package d2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

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
        System.out.println("----------------");


        long size = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(size);
        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println);
        System.out.println("----------------");
        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach(System.out::println);
        System.out.println("----------------");

        // Map加工方法
        // 给集合元素的前面都加上一个"黑马的"

        list.stream().map(s -> "《倚天屠龙记》：" + s).forEach(System.out::println);
        System.out.println("----------------");

        // 需求：把所有的学生加工成一个学生对象

        // list.stream().map(s -> new Student(s)).forEach(System.out::println);
        list.stream().map(Student::new).forEach(System.out::println);
        System.out.println("----------------");

        // 合并流
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("Java1", "Java2", "html");
        // public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
        Stream<String> s3 = Stream.concat(s1, s2);
        // s3.forEach(System.out::println);
        s3.distinct().forEach(System.out::println);
        System.out.println("----------------");

    }
}
