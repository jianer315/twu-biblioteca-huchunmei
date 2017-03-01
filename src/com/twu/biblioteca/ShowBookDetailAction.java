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
        GetBookImp getBookImp=new GetBookImp();
        List<Book> booklist1=new ArrayList<Book>();
        String detail="";
        booklist1=getBookImp.getbooklist();
        for(int i = 0;i<booklist1.size();i++){

            if(booklist1.get(i).getBookId()==bookId)
            {
                detail=booklist1.get(i).getBookName()+booklist1.get(i).getAuthor()+booklist1.get(i).getYearPub();
                //System.out.println("console"+book.getState());
               break;
            }

        }
        return  detail;
    }
}
