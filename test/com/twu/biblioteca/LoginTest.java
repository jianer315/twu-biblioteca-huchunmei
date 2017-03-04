package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginTest {

    @Test
    public void testLoginActionSuccess() {
        //given
        String account = "no-1";
        String password = "12345612";

        //when
        String result = LoginAction.Login(account, password);

        //then
        assertEquals("Login Successfully", result);
    }

    @Test
    public void testLoginActionFail1() {
        //given
        String account = "huhu";
        String password = "";

        //when
        String result = LoginAction.Login(account, password);

        //then
        Assert.assertEquals("Login fail", result);
    }

    @Test
    public void testLoginActionFail2() {
        //given
        String account = "hu";
        String password = "123456";

        //when
        String result = LoginAction.Login(account, password);

        //then
        Assert.assertEquals("Login fail", result);
    }

    @Test
    public void testLoginActionFail3() {
        //given
        String account = "hu";
        String password = "";

        //when
        String result = LoginAction.Login(account, password);

        //then
        Assert.assertEquals("Login fail", result);
    }

}
