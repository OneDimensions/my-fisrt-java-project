package com.onedimension.moive;

public class Test {
    public static void main(String[] args) {
        // 创建数据
        MovieBean[] movies = new MovieBean[5];
        MovieBean movie1 = new MovieBean(1, "出圈", 9.5, "王宝强", new String[]{"王宝强", "王宝强", "王宝强"}, 1000000, "http://www.baidu.com");
        MovieBean movie2 = new MovieBean(2, "一点", 9.5, "许文强", new String[]{"刘诗诗", "许文强", "许文强"}, 1000000, "http://www.baidu.com");
        MovieBean movie3 = new MovieBean(3, "唐人街探案1", 9.5, "王宝强", new String[]{"王宝强", "王宝强", "王宝强"}, 1000000, "http://www.baidu.com");
        MovieBean movie4 = new MovieBean(4, "唐人街探案2", 9.5, "王宝强", new String[]{"王宝强", "王宝强", "王宝强"}, 1000000, "http://www.baidu.com");
        MovieBean movie5 = new MovieBean(5, "唐人街探案3", 9.5, "王宝强", new String[]{"王宝强", "王宝强", "王宝强"}, 1000000, "http://www.baidu.com");
        movies[0] = movie1;
        movies[1] = movie2;
        movies[2] = movie3;
        movies[3] = movie4;
        movies[4] = movie5;

        MovieOperator movieOperator = new MovieOperator(movies);
        movieOperator.printAllMovies();

        movieOperator.printMovieById(1);
    }
}
