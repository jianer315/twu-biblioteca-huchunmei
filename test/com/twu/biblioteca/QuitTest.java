package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cmhu on 01/03/2017.
 */
public class QuitTest {
    @Test

    public void testQuitCase1()
    {
        String username="huchunmei";
        String result=QuitAction.quit(username);
        assertEquals("quit successfully",result);
    }
}
