package d9_map_impl;

import d1_collection_set.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Map<Student, String> maps = new HashMap<>();

        Student s1 = new Student("令狐冲", 20, '男');
        Student s2 = new Student("任盈盈", 18, '女');
        Student s3 = new Student("方正大师", 65, '男');
        Student s4 = new Student("令狐冲", 20, '男');


        maps.put(s1, "北京");
        maps.put(s2, "上海");
        maps.put(s3, "广州");
        maps.put(s4, "广州");

        System.out.println(maps);

    }
}
