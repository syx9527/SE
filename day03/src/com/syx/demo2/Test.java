package com.syx.demo2;

public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("长津湖", 9.7, "吴京");
        movies[1] = new Movie("我和我的父亲", 8.5, "吴京");
        movies[2] = new Movie("扑水少年", 9.2, "王川");
        for (Movie m : movies) {
            System.out.println(m);
        }
    }
}
