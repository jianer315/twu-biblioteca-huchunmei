package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cmhu on 01/03/2017.
 */
public class BorrowBookTest {

    @Test
    public void testBorrowBookSuccess() {
        //given
        int bookid=2;
        String account="no-1";
        //when
        String result=BorrowBookAction.BorrowBook(bookid,account);

        //then
        Assert.assertEquals("borrow books successfully",result);
    }

    @Test
    public void testBorrowBookFail()
    {   //given
        int bookid=4;
        String account="no-1";

        //when
        String result=BorrowBookAction.BorrowBook(bookid,account);

        //then
        Assert.assertEquals("The book is not for borrow",result);
    }
    @Test
    public void testBorrowBookNotLogin()
    {   //given
        int bookid=2;
        String account="";

        //when
        String result=BorrowBookAction.BorrowBook(bookid,account);

        //then
        Assert.assertEquals("please login",result);
    }
}
