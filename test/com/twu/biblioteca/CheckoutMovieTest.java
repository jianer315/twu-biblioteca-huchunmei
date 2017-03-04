package com.twu.biblioteca;

import com.twu.bean.Checkout_item;
import com.twu.bean.Movie;
import com.twu.service.GetMovie;
import com.twu.serviceImp.GetCheckoutImp;
import com.twu.serviceImp.GetMovieImp;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by cmhu on 03/03/2017.
 */
public class CheckoutMovieTest {
    @Test
    public void testCheckoutMovieSuccess()
    {   //given
        GetMovieImp getMovieImp=new GetMovieImp();
        List<Movie> movieList=new ArrayList<Movie>();
        List<Checkout_item> movieList_check=new ArrayList<Checkout_item>();
        GetCheckoutImp checkoutImp=new GetCheckoutImp();
        movieList_check=checkoutImp.getCheckout();
        movieList=getMovieImp.getMovieList();
        Movie movie=new Movie();
        int flag=0;
        for(int i = 0;i<movieList.size();i++){
            for(int j = 0;i<movieList_check.size();j++) {
                if (movieList.get(i).getId()==movieList_check.get(j).getMovie_id()) {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                movie=movieList.get(i);
            }
            break;

        }

        //when
        String result=CheckoutMovieAction.CheckoutMovie(movie.getId());

        //then
        assertEquals("Pay successfully",result);
    }

}
