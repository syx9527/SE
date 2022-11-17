package d1_collection_set;

import java.util.HashSet;
import java.util.Set;

/**
 * 需求：
 * 创建一个存储学生对象的集合，存储多个学生对象，使用程序实现在控制台遍历该集合
 * 要求：
 * 学生独享成员变量值相同，我们就认为是同一个对象
 *
 * @author SLJ
 */
public class SetDemo3 {
    public static void main(String[] args) {
        // Set集合去重原理：先判断Hash值，再判断equals
        Set<Student> sets = new HashSet<>();

        Student s1 = new Student("林青霞", 32, '女');
        Student s2 = new Student("令狐冲", 22, '男');
        Student s3 = new Student("林青霞", 32, '女');

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        System.out.println(sets);
    }
}
