package com.onedimension.moviemanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Movie> moives = new ArrayList<>();

        MovieControl movieControl = new MovieControl(moives);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("电影管理系统, 请选择操作:");
            for (int i = 0; i < MovieOperate.OPERATE.length; i++) {
                System.out.println((i + 1) + ":" + MovieOperate.OPERATE[i]);
            }

            System.out.println("目前系统中的电影有:");
            for (Movie movie : moives) {
                System.out.println(movie);
            }

            System.out.println();

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice < 1 || choice > MovieOperate.OPERATE.length) {
                    System.out.println("输入错误，请重新输入");
                    continue;
                }
                String movieName = "";
                String actor = "";
                switch (choice) {
                    // 添加
                    case 1:
                        System.out.println("请输入电影名称:");
                        movieName = scanner.next();
                        System.out.println("请输入导演: ");
                        String director = scanner.next();
                        System.out.println("请输入主演: ");
                        actor = scanner.next();
                        movieControl.addMovie(new Movie(movieName, director, actor));
                        break;
                    // 查询
                    case 2:
                        System.out.println("请输入电影名称:");
                        movieName = scanner.next();
                        List<Movie> movies = movieControl.getMovieByName(movieName);
                        System.out.println("查询结果如下:");
                        for (Movie movie : movies) {
                            System.out.println(movie);
                        }
                        break;
                    // 根据名称删除
                    case 3:
                        System.out.println("请输入电影名称:");
                        movieName = scanner.next();
                        movieControl.deleteMovieByMovie(movieName);
                        break;
                    case 4:
                        System.out.println("请输入演员: ");
                        actor = scanner.next();
                        movieControl.deleteMovieByActor(actor);
                        break;
                }

            } else {
                System.out.println("输入错误，请重新输入");
            }
        }

    }
}
