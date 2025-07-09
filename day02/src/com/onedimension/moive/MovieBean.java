package com.onedimension.moive;

/**
 * 电影实体类
 */
public class MovieBean {
    /**
     * id
     */
    private int id;
    /**
     * 电影名称
     */
    private String name;
    /**
     * 电影评分
     */
    private double score;
    /**
     * 导演
     */
    private String director;
    /**
     * 演员
     */
    private String[] actors;
    /**
     * 想看人数
     */
    private int wantSeeCount;
    /**
     * 封面图
     */
    private String cover;

    public MovieBean() {
    }

    public MovieBean(int id, String name, double score, String director, String[] actors, int wantSeeCount, String cover) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.director = director;
        this.actors = actors;
        this.wantSeeCount = wantSeeCount;
        this.cover = cover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public int getWantSeeCount() {
        return wantSeeCount;
    }

    public void setWantSeeCount(int wantSeeCount) {
        this.wantSeeCount = wantSeeCount;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
