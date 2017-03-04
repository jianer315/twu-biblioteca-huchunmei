package com.twu.biblioteca;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by cmhu on 01/03/2017.
 */
public class QuitTest {
    @Test
    public void testQuitAction()
    {   //given
        String account="no-1";

        //when
        String result=QuitAction.quit(account);

        //then
        assertEquals("quit successfully",result);
    }
}
