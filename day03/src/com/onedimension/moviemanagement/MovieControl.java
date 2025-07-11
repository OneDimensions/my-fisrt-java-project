package com.onedimension.moviemanagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieControl implements MovieControlImp {
    private List<Movie> movies;

    @Override
    public void addMovie(Movie movie) {
        if (movie == null) {
            throw new NoMovieException("电影不能为空");
        }
        movies.add(movie);
    }

    @Override
    public List<Movie> getMovieByName(String name) {
        return movies.stream().filter(m -> m.getName().equals(name)).toList();
    }

    @Override
    public void deleteMovieByMovie(String name) {
        Iterator<Movie> iterator = movies.iterator();
        List<Movie> deleteList = new ArrayList<>();
        while (iterator.hasNext()) {
            Movie movie = iterator.next();
            if (movie.getName().equals(name)) {
                deleteList.add(movie);
                iterator.remove();
            }
        }
        if (deleteList.isEmpty()) {
            System.out.println("没有找到该电影");
        } else {
            System.out.println("删除成功:");
            System.out.println(deleteList);
        }
    }

    @Override
    public void deleteMovieByActor(String actor) {
        List<Movie> deleteList = new ArrayList<>();
        Iterator<Movie> iterator = movies.iterator();
        while (iterator.hasNext()) {
            Movie movie = iterator.next();
            if (movie.getActor().equals(actor)) {
                deleteList.add(movie);
                iterator.remove();
            }
        }
        if (deleteList.isEmpty()) {
            System.out.println("没有找到该演员主演的电影");
        } else {
            System.out.println("删除成功:");
            System.out.println(deleteList);
        }
    }
}
