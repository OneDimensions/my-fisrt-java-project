package com.onedimension.moviemanagement;

import java.util.List;

public interface MovieControlImp {

    /**
     * 添加电影
     * @param movie 影片
     */
    void addMovie(Movie movie);

    /**
     * 根据电影名查询影片
     * @param name 电影名
     * @return 影片
     */
    List<Movie> getMovieByName(String  name);

    /**
     * 根据电影名下架影片
     * @param name 电影名
     */
    void deleteMovieByMovie(String name);

    /**
     * 根据主演下架所有影片
     */
    void deleteMovieByActor(String actor);
}
