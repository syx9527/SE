package Api.ArrayListApi;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("java");
        list.add("5656");
        list.add(6);
        list.add('5');
        System.out.println(list); // [java, 5656, 6, 5]
        list.add(1, "大哥");
        System.out.println(list);

    }
}
