package com.twu.bean;

import java.util.Date;

/**
 * Created by cmhu on 03/03/2017.
 */
public class Movie {
    private int id;
    private String moviename;
    private String movieyear;
    private String director;
    private int rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getMovieyear() {
        return movieyear;
    }

    public void setMovieyear(String movieyear) {
        this.movieyear = movieyear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
