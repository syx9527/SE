package d7_arrays;

import com.oracle.net.Sdp;

import java.time.Instant;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 目标：自定义数组的排序规则：Comparator比较器对象
 *
 * @author 17447
 */
public class ArraysDemo2 {
    public static void main(String[] args) {
        // 1.Arrays的sort方法对于数组默认升序排序
        int[] ages = {34, 12, 42, 23,};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));

        // 需求：降序排序,(自定义比较对象，之恩呢支持引用类型的数据)
        Integer[] ages1 = {34, 12, 42, 23,};
        Arrays.sort(ages1, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println("---------------------");

        Student[] students = new Student[3];

        students[0] = new Student("刘光明", 23, 175);
        students[1] = new Student("蔡元培", 18, 185.3);
        students[2] = new Student("赵丽君", 26, 180);
        System.out.println(Arrays.toString(students));

        System.out.println("--------------");

        // Arrays.sort(students); // 直接报错
        Arrays.sort(students, (o1, o2) -> {
            // 自己指定规则
            return Double.compare(o2.getHeight(), o1.getHeight());
        });
        System.out.println(Arrays.toString(students));

    }
}
