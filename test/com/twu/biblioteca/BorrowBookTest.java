package com.twu.biblioteca;

import com.twu.bean.Book;
import com.twu.service.GetBook;
import com.twu.serviceImp.GetBookImp;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by cmhu on 01/03/2017.
 */
public class BorrowBookTest {

    @Test

    public void testBorrowBookCase1() {

        GetBookImp getBookImp=new GetBookImp();
        List <Book>booklist1=new ArrayList<Book>();
        booklist1=getBookImp.getbooklist();
        Book book=new Book();
        for(int i = 0;i<booklist1.size();i++){

            if(booklist1.get(i).getState()==1)
            {
                book=booklist1.get(i);
                //System.out.println("console"+book.getState());
                break;
            }

        }

        String result=BorrowBookAction.BorrowBook(book);
        Assert.assertEquals("borrow books successfully",result);

    }



    @Test

    public void testBorrowBookCase2()
    {
        GetBookImp getBookImp=new GetBookImp();
        List<Book> booklist=new ArrayList<Book>();
        booklist=getBookImp.getbooklist();
        Book book=new Book();
        for(int i = 0;i<booklist.size();i++){

            if(booklist.get(i).getState()==0)
            {
                book=booklist.get(i);
                //System.out.println("console"+book.getState());
                break;
            }

        }
        String result=BorrowBookAction.BorrowBook(book);
        Assert.assertEquals("The book is not for borrow",result);

    }
}
