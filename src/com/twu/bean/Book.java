package com.twu.bean;

import java.util.Date;

/**
 * Created by Administrator on 2017/2/25.
 */
public class Book {
    private String author;
    private String bookName;
    private String yearPub;
    private int bookId;
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getYearPub() {
        return yearPub;
    }

    public void setYearPub(String yearPub) {
        this.yearPub = yearPub;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

}
