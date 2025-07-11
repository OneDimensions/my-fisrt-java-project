package com.onedimension.moviemanagement;

public class NoMovieException extends RuntimeException{
    public NoMovieException() {
    }

    public NoMovieException(String message) {
        super(message);
    }
}
