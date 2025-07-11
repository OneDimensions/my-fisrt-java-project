package com.onedimension.moviemanagement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    public Movie getMovie(String name) {
        return null;
    }

    @Override
    public void deleteMovieByMovie(String name) {

    }

    @Override
    public void deleteMovieByActor(String actor) {

    }
}
