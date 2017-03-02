package com.twu.biblioteca;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class LoginTest {

    @Test
    public void testLoginActionSuccess()
    {   //given
        String username="huchunmei";
        String password="123456";

        //when
        int result=LoginAction.Login(username,password);

        //then
        assertEquals(1,result);
    }
    @Test
    public void testLoginActionFail1()
    {   //given
        String username="huchunmei";
        String password="";

        //when
        int result=LoginAction.Login(username,password);

        //then
        Assert.assertEquals(0,result);
    }
    @Test
    public void testLoginActionFail2()
    {   //given
        String username="hu";
        String password="123456";

        //when
        int result=LoginAction.Login(username,password);

        //then
        Assert.assertEquals(0,result);
    }
    @Test
    public void testLoginActionFail3()
    {   //given
        String username="hu";
        String password="";

        //when
        int result=LoginAction.Login(username,password);

        //then
        Assert.assertEquals(0,result);
    }

}
