package com.twu.biblioteca;

import com.twu.bean.Checkout_item;
import com.twu.serviceImp.GetCheckoutImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 03/03/2017.
 */
public class WatchMovieAction {
    public static String WatchMovie(int movieid) {
        List<Checkout_item> movieList_check=new ArrayList<Checkout_item>();
        GetCheckoutImp checkoutImp=new GetCheckoutImp();
        movieList_check=checkoutImp.getCheckout();
        int flag=0;
        for(int i = 0;i<movieList_check.size();i++){

            if(movieList_check.get(i).getMovie_id()==movieid && movieid>0)
            {   flag=1;
                break;
            }

        }
        if(flag==1)
        {
            return "you can watch movie!";
        }
        else
        {
            return "please check out for watching";
        }
    }
}
