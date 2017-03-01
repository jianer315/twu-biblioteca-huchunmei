package com.twu.biblioteca;

import com.twu.bean.Book;

/**
 * Created by cmhu on 01/03/2017.
 */
public class BorrowBookAction {
    public static String BorrowBook(Book book) {
        if(book.getState()==1)
        {
            return "borrow books successfully";
        }

       else
        {
            return "The book is not for borrow";
        }


    }

}
