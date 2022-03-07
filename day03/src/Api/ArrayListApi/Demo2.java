package Api.ArrayListApi;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("python");
        list.add("Java");
        list.add("Vue");
        list.add("Js");
        list.add("MySql");
        list.add("Java");
        list.add("Sql Server");
        System.out.println(list);

        String s1 = list.get(3);
        System.out.println(s1);
        System.out.println("---------------------");
        int size = list.size();
        System.out.println(size);
        System.out.println("---------------------");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        String s2 = list.remove(2);
        System.out.println(s2);
        System.out.println(list);
        System.out.println("---------------------");

        String s3 = list.set(3, "test");
        System.out.println(s3);
        System.out.println(list);
        System.out.println("---------------------");

        boolean res = list.remove("Java");
        System.out.println(res);
        System.out.println(list);
        System.out.println("---------------------");


    }
}
