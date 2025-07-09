package com.onedimension.moive;

public class MovieOperator {
    private MovieBean[] movies = new MovieBean[5];

    public MovieOperator(MovieBean[] movies) {
        this.movies = movies;
    }

    public void printAllMovies() {
        for (MovieBean m : this.movies) {
            System.out.println("电影名:" + m.getName() + "  评分:" + m.getScore());
        }
    }

    public MovieBean getMovieById(int id) {
        return movies[id];
    }

    public void printMovieById(int id) {
        for (MovieBean m : this.movies) {
            if(m.getId() == id) {
                System.out.println("电影名:" + m.getName() + "  评分:" + m.getScore());
                break;
            }
        }
        System.out.println("没有找到该电影");
    }

}
