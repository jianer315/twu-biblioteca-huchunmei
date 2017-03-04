package com.twu.biblioteca;

import com.twu.bean.Book;
import com.twu.bean.Checkout_item;
import com.twu.bean.Movie;
import com.twu.serviceImp.GetBookImp;
import com.twu.serviceImp.GetCheckoutImp;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 03/03/2017.
 */
public class WatchMovieTest {
    @Test
    public void testWatchMovieSuccess() {
        //given
        List<Checkout_item> movieList_check=new ArrayList<Checkout_item>();
        GetCheckoutImp checkoutImp=new GetCheckoutImp();
        movieList_check=checkoutImp.getCheckout();
        int movieid=0;
        for(int i = 0;i<movieList_check.size();i++){

            if(movieList_check.get(i).getMovie_id()>0)
            {
                movieid=movieList_check.get(i).getMovie_id();
                break;
            }

        }

        //when
        String result= WatchMovieAction.WatchMovie(movieid);

        //then
        Assert.assertEquals("you can watch movie!",result);
    }
    @Test
    public void testWatchMovieFail() {
        //given
        List<Checkout_item> movieList_check=new ArrayList<Checkout_item>();
        GetCheckoutImp checkoutImp=new GetCheckoutImp();
        movieList_check=checkoutImp.getCheckout();
        int movieid=0;
        for(int i = 0;i<movieList_check.size();i++){

            if((movieList_check.get(i).getMovie_id())>0)
            {
                continue;
            }
            else
            {
                movieid=movieList_check.get(i).getMovie_id();
                break;
            }

        }

        //when
        String result= WatchMovieAction.WatchMovie(movieid);

        //then
        Assert.assertEquals("please check out for watching",result);
    }
}
