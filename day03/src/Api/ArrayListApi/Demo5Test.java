package Api.ArrayListApi;

import java.util.ArrayList;

public class Demo5Test {
    public static void main(String[] args) {
        // 目标：理解 ArrayList 存储自定义类目标

        // 1.定义电影类
        // 2.创建三个电影对象

        Movie m1 = new Movie("肖生克的救赎", 9.7, "罗宾斯");
        Movie m2 = new Movie("霸王别姬", 9.8, "张国荣、张丰毅");
        Movie m3 = new Movie("阿甘正传", 9.7, "汤姆汉克斯");

        // 3.创建电影类的ArrayList集合
        ArrayList<Movie> movies = new ArrayList<>();
        // 4.添加电影对象加入ArrayList
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        System.out.println(movies);
        for (int i = 0; i < movies.size(); i++) {
            Movie m = movies.get(i);
            System.out.println("----------------");
            System.out.println("电影名称" + m.getName());
            System.out.println("电影评分" + m.getScore());
            System.out.println("电影主演" + m.getActor());
            System.out.println("----------------");
        }

    }
}
