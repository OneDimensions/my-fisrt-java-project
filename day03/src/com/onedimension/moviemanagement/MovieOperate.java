package com.onedimension.moviemanagement;

public abstract class MovieOperate {
    public static final String ADD_MOVIE = "添加电影";
    public static final String GET_MOVIE_BY_NAME = "查询电影";
    public static final String DELETE_MOVIE_BY_NAME = "下架电影";
    public static final String DELETE_MOVIE_BY_ACTOR = "下架主演的所有电影";
    public static final String[] OPERATE = {ADD_MOVIE, GET_MOVIE_BY_NAME, DELETE_MOVIE_BY_NAME, DELETE_MOVIE_BY_ACTOR};
}

