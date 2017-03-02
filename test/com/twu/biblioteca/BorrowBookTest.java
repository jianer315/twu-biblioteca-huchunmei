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
public class BorrowBookTest {

    @Test
    public void testBorrowBookSuccess() {
        //given
        GetBookImp getBookImp=new GetBookImp();
        List <Book>booklist=new ArrayList<Book>();
        booklist=getBookImp.getbooklist();
        Book book=new Book();
        for(int i = 0;i<booklist.size();i++){

            if(booklist.get(i).getState()==1)
            {
                book=booklist.get(i);
                //System.out.println("console"+book.getState());
                break;
            }

        }

        //when
        String result=BorrowBookAction.BorrowBook(book);

        //then
        Assert.assertEquals("borrow books successfully",result);
    }

    @Test
    public void testBorrowBookFail()
    {   //given
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

        //when
        String result=BorrowBookAction.BorrowBook(book);

        //then
        Assert.assertEquals("The book is not for borrow",result);
    }
}
