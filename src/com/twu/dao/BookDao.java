package com.twu.dao;

import com.twu.bean.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
public class BookDao {
    /*本来应该从数据库进行数据操作，题目设定书籍列表是预先存在的/
     */

    public List findallbooks()
    {
        List<Book>booklist=new ArrayList<Book>();
        Book book1=new Book();
        book1.setBookId(1);
        book1.setAuthor("hu");
        book1.setYearPub("2012-09");
        book1.setBookName("spring");
        Book book2=new Book();
        book2.setBookName("java");
        book2.setAuthor("au1");
        book2.setBookId(2);
        book2.setYearPub("2013");
        Book book3=new Book();
        book3.setYearPub("2014");
        book3.setBookId(3);
        book3.setAuthor("au2");
        book3.setBookName("c++");
        return  booklist;
    }

}
