package d4_collection_object;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author SYX
 */
public class TestDemo {
    public static void main(String[] args) {
        // 1.定义一个电影类
        // 2.定义一个集合对象存储3部电影
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《你好，李焕英》", 9.5, "沈腾、张小斐、贾玲、陈赫"));
        movies.add(new Movie("《唐人街探案》", 8.5, "王宝强、刘昊然、美女"));
        movies.add(new Movie("《刺客小说家》", 8.6, "雷佳音、杨幂"));


        // 3.遍历集合容易中的每个电影对象
        for (Movie movie : movies) {
            System.out.println(movie);
        }


    }
}
