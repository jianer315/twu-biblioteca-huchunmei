package com.twu.biblioteca;

import com.twu.bean.Book;
import com.twu.serviceImp.GetBookImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 01/03/2017.
 */
public class ShowListAction {
    public static List<Book> ShowList(String option) {

        if (option.equals("list books")) {
            GetBookImp getBookImp = new GetBookImp();
            List<Book> booklist1 = new ArrayList<Book>();
            List<Book> booklist2 = new ArrayList<Book>();
            booklist1 = getBookImp.getbooklist();
            for (int i = 0; i < booklist1.size(); i++) {

                if (booklist1.get(i).getState() == 1) {
                    booklist2.add(booklist1.get(i));
                }
            }
            return booklist2;
        } else
        { return null;}
    }
}
