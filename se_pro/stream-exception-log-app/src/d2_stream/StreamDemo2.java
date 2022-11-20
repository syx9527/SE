package d2_stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * Sream流的思想和使用步骤
 * <p>
 * - **先得到集合或者数组的Steam流（就是一根传送带）**
 * - **把元素放上去**
 * - **然后就用这个Steam流简化的API来方便的操作元素**
 * <p>
 * <p>
 * 集合获取Stream流的方式
 * 可以使用Collection接口中的默认方法生成stream()生成流
 * default Stream <E> stream()
 * <p>
 * 数组获取Stream流的方式
 * | public static <T> Stream<T> stream(T[] array)
 * | public static <T> Stream<T> of(T...values)
 *
 * @author SYX
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        /*-------------Collection集合获取流--------------*/

        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();

        /*-------------Map集合获取流--------------*/
        Map<String, Integer> maps = new HashMap<>();

        // 拿键流
        Stream<String> keysStream = maps.keySet().stream();
        // 值流
        Stream<Integer> valuesStream = maps.values().stream();
        //键值流
        Stream<Map.Entry<String, Integer>> mapsStream = maps.entrySet().stream();


        /*-------------数组取流--------------*/
        String[] names = {"张三丰", "周三"};
        Stream<String> namesStream = Arrays.stream(names);

        Stream<String> namesStream2 = Stream.of(names);


    }
}
