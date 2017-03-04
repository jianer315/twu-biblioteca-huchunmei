package com.twu.biblioteca;

import com.twu.bean.Book;
import com.twu.serviceImp.GetBookImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 01/03/2017.
 */
public class ShowBookDetailAction {
    public static String ShowBookDetail(int bookId) {
        GetBookImp getBookImp = new GetBookImp();
        List<Book> booklist = new ArrayList<Book>();
        String detail = "";
        booklist = getBookImp.getbooklist();
        for (int i = 0; i < booklist.size(); i++) {
            if (booklist.get(i).getBookId() == bookId) {
                detail = booklist.get(i).getBookName() + " " + booklist.get(i).getAuthor() + " " + booklist.get(i).getYearPub();
                break;
            }
        }
        return detail;
    }
}
