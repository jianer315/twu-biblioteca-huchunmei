package com.twu.biblioteca;

import com.twu.bean.Checkout_item;
import com.twu.bean.Movie;
import com.twu.serviceImp.GetCheckoutImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 03/03/2017.
 */
public class CheckoutMovieAction {
    public static String CheckoutMovie(int id) {
        List<Checkout_item> movieList_check=new ArrayList<Checkout_item>();
        GetCheckoutImp checkoutImp=new GetCheckoutImp();
        int flag=0;
        for(int i = 0;i<movieList_check.size();i++){
            if(id==movieList_check.get(i).getMovie_id())
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            return "Pay successfully";
        }
        else
        {
            return "Pay fail";
        }

    }
}
