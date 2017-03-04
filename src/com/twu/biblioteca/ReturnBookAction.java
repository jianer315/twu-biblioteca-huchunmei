package com.twu.biblioteca;

import com.twu.bean.Book;
import com.twu.bean.LoginInfo;
import com.twu.serviceImp.GetBookImp;

import java.util.ArrayList;
import java.util.List;

import static com.twu.biblioteca.BorrowBookAction.getLoginInfo;

/**
 * Created by cmhu on 01/03/2017.
 */
public class ReturnBookAction {
    public static String ReturnBook(String account, int bookid) {
        LoginInfo loginInfo = getLoginInfo(account);
        int exist = 0;
        List<Book> bookList = new ArrayList<Book>();
        GetBookImp getBookImp = new GetBookImp();
        bookList = getBookImp.getbooklist();
        for (int i = 0; i < bookList.size(); i++) {

            if (bookid == bookList.get(i).getBookId()) {
                exist = 1;
                break;
            }
        }
        if (loginInfo.getStatus() == 1 && exist == 1) {
            return "return books successfully";
        } else if (loginInfo.getStatus() == 0 && exist == 1) {
            return "please login";
        } else {
            return "The book is not in the library";
        }
    }
}


