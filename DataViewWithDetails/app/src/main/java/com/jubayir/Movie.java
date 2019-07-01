package com.jubayir;

public class Movie {

    private  String movieName;
    private  String movieDirector;
    private int image;

    public Movie() {
    }

    public Movie(String movieName, String movieDirector, int image) {
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.image = image;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public int getImage() {
        return image;
    }
}
