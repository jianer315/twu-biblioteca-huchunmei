package com.twu.biblioteca;

import com.twu.bean.Checkout_item;
import com.twu.bean.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 04/03/2017.
 */
public class CheckoutBookInfoTest {
    @Test
    public void testCheckoutBookInfoLib() {
        //givenno-admin
        String librarian="no-admin";

        //when
        List <Checkout_item>result=new ArrayList<Checkout_item>();
        result= CheckoutBookInfoAction.CheckoutBookInfo(librarian);
        int res=0;

        //then
        for(int i=0;i<result.size();i++)
        {   if(result.get(i).getBook_id()>0)
            {
               res=1;
            }
            Assert.assertEquals(1,res);
        }
    }

    @Test
    public void testCheckoutBookInfoUser() {
        //given
        String user="no-1";

        //when
        List <Checkout_item>result=new ArrayList<Checkout_item>();
        result= CheckoutBookInfoAction.CheckoutBookInfo(user);

        //then
        Assert.assertEquals(null,result);

    }
}
