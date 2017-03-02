package com.twu.biblioteca;

import com.twu.bean.Book;
import com.twu.serviceImp.GetBookImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 01/03/2017.
 */
public class ReturnBookAction {
    public static String ReturnBook(Book book) {

        int exist = 0;
        List<Book> bookList = new ArrayList<Book>();
        GetBookImp getBookImp = new GetBookImp();
        bookList = getBookImp.getbooklist();
        for (int i = 0; i < bookList.size(); i++) {

            if (book.getBookId() == bookList.get(i).getBookId()) {
                exist = 1;
                break;
            }

        }

        if (exist == 1) {
            return "return books successfully";
        } else {
            return "The book is not in the library";
        }
    }
}


