package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by cmhu on 01/03/2017.
 */
public class ReturnBookTest {
    @Test
    public void testReturnBookSuccess() {
        //given
        int bookid = 1;
        String account = "no-2";

        //when
        String result = ReturnBookAction.ReturnBook(account, bookid);

        //then
        Assert.assertEquals("return books successfully", result);
    }

    @Test
    public void testReturnBookFail() {
        //given
        int bookid = 1000;
        String account = "no-1";

        //when
        String result = ReturnBookAction.ReturnBook(account, bookid);

        //then
        Assert.assertEquals("The book is not in the library", result);

    }

    @Test
    public void testReturnBookNotLogin() {
        //given
        int bookid = 5;
        String account = "no-3";

        //when
        String result = ReturnBookAction.ReturnBook(account, bookid);

        //then
        Assert.assertEquals("please login", result);
    }
}
