package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cmhu on 04/03/2017.
 */
public class ViewAccountInfoTest {
    @Test
    public void testViewAccountInfoOk() {
        //given
        String account = "no-1";
        String Info = "huhu 99999@qq.com 1111111";

        //when
        String result = ViewAccountInfoAction.ViewAccountInfo(account);

        //then
        assertEquals(Info, result);
    }

    @Test
    public void testViewAccountInfoFail() {
        //given
        String account = "no-3";

        //when
        String result = ViewAccountInfoAction.ViewAccountInfo(account);

        //then
        assertEquals("please login", result);
    }
}
