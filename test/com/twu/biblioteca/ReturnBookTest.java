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
public class ReturnBookTest {
    @Test
    public void testReturnBookSuccess() {
        //given
        GetBookImp getBookImp=new GetBookImp();
        List<Book> booklist1=new ArrayList<Book>();
        booklist1=getBookImp.getbooklist();
        Book book=new Book();
        for(int i = 0;i<booklist1.size();i++){

            if(booklist1.get(i).getState()==2)
            {
                book=booklist1.get(i);
                break;
            }

        }

        //when
        String result= ReturnBookAction.ReturnBook(book);

        //then
        Assert.assertEquals("return books successfully",result);
    }

    @Test
    public void testReturnBookFail() {
        //given
        Book book=new Book();
        book.setBookId(1);
        book.setBookName("nonono");

        //when
        String result= ReturnBookAction.ReturnBook(book);

        //then
        Assert.assertEquals("The book is not in the library",result);

    }
}
