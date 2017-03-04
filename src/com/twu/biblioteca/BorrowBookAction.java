package com.twu.biblioteca;

import com.twu.bean.Book;
import com.twu.bean.LoginInfo;
import com.twu.serviceImp.GetBookImp;
import com.twu.serviceImp.GetLoginStatusImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 01/03/2017.
 */
public class BorrowBookAction {
    public static String BorrowBook(int bookid, String account) {
        LoginInfo loginInfo = getLoginInfo(account);
        GetBookImp getBookImp = new GetBookImp();
        List<Book> books = new ArrayList<Book>();
        books = getBookImp.getbooklist();
        if (loginInfo.getStatus() == 1) {
            for (int i = 0; i < books.size(); i++) {
                if (bookid == books.get(i).getBookId() && books.get(i).getState() == 1) {
                    return "borrow books successfully";
                } else if (bookid == books.get(i).getBookId() && books.get(i).getState() == 0) {
                    return "The book is not for borrow";
                }
            }
        }
        return "please login";
    }

    static LoginInfo getLoginInfo(String account) {
        GetLoginStatusImp getLoginStatusImp = new GetLoginStatusImp();
        List<LoginInfo> loginInfos = new ArrayList<LoginInfo>();
        loginInfos = getLoginStatusImp.getLoginStatus();
        LoginInfo loginInfo = new LoginInfo();
        for (int i = 0; i < loginInfos.size(); i++) {
            if (account == loginInfos.get(i).getLibnumber()) {
                loginInfo = loginInfos.get(i);
            }
        }
        return loginInfo;
    }
}
