package com.twu.bean;

/**
 * Created by cmhu on 03/03/2017.
 */
public class Checkout_item {
    private String user_libnumber;
    private int book_id;
    private int movie_id;
    public String getUser_libnumber() {
        return user_libnumber;
    }

    public void setUser_libnumber(String user_libnumber) {
        this.user_libnumber = user_libnumber;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

}
