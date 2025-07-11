package com.onedimension.moviemanagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> moives = new ArrayList<>();

        MovieControl movieControl = new MovieControl(moives);

        while (true) {
            System.out.println("电影管理系统");
            System.out.println("1. 添加电影");
            System.out.println("2. 删除电影");
        }

    }
}
