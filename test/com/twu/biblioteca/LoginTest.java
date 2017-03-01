package com.twu.biblioteca;


import com.twu.bean.Book;
import com.twu.service.GetLogin;
import com.twu.serviceImp.GetBookImp;
import com.twu.serviceImp.GetLoginImp;
import com.twu.serviceImp.ShowBorrowImp;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;
import com.twu.biblioteca.*;

import java.util.List;

public class LoginTest {

    @Test

    public void testLoginCase1()
    {
        String username="huchunmei";
        String password="123456";
        int result=LoginAction.Login(username,password);
        assertEquals(1,result);
    }
    @Test
    public void testLoginCase2()
    {
        String username="huchunmei";
        String password="";
        int result=LoginAction.Login(username,password);
        Assert.assertEquals(0,result);
    }
    @Test
    public void testLoginCase3()
    {
        String username="hu";
        String password="123456";
        int result=LoginAction.Login(username,password);
        Assert.assertEquals(0,result);
    }
    @Test
    public void testLoginCase4()
    {
        String username="hu";
        String password="";
        int result=LoginAction.Login(username,password);
        Assert.assertEquals(0,result);
    }

}
