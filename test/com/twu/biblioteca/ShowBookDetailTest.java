package com.twu.biblioteca;

import com.twu.bean.Book;
import com.twu.serviceImp.GetBookImp;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 01/03/2017.
 */
public class ShowBookDetailTest {

    @Test

    public void testShowBookDetailCase1() {

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
        String actual="";
        String result=ShowBookDetailAction.ShowBookDetail(book.getBookId());
        Assert.assertEquals(actual+book.getBookName()+book.getAuthor()+book.getYearPub(),result);
    }
}
