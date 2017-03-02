package com.twu.serviceImp;

import com.twu.bean.Book;
import com.twu.service.GetBook;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
public class GetBookImp implements GetBook {
    @Override
    public List getbooklist() {
        List<Book> booklist = new ArrayList<Book>();
        Book book1 = new Book();
        book1.setBookId(100);
        book1.setAuthor("hu");
        book1.setBookName("java");
        book1.setYearPub("2000");
        book1.setState(1);

        Book book2 = new Book();
        book2.setBookId(101);
        book2.setAuthor("huc");
        book2.setBookName("java1");
        book2.setYearPub("2009");
        book2.setState(1);

        Book book3 = new Book();
        book3.setBookId(101);
        book3.setAuthor("huch");
        book3.setBookName("java2");
        book3.setYearPub("2008");
        book3.setState(1);

        Book book4 = new Book();
        book4.setBookId(102);
        book4.setAuthor("huchm");
        book4.setBookName("java3");
        book4.setYearPub("2005");
        book4.setState(0);
        booklist.add(book1);
        booklist.add(book2);
        booklist.add(book3);
        booklist.add(book4);

        Book book5 = new Book();
        book5.setBookId(103);
        book5.setAuthor("huchme");
        book5.setBookName("java4");
        book5.setYearPub("2006");
        book5.setState(2);
        booklist.add(book1);
        booklist.add(book2);
        booklist.add(book3);
        booklist.add(book4);
        booklist.add(book5);

        return booklist;
    }
}
