package com.twu.biblioteca;

import com.twu.bean.Checkout_item;
import com.twu.bean.LoginInfo;
import com.twu.bean.Movie;
import com.twu.serviceImp.GetCheckoutImp;
import com.twu.serviceImp.GetLoginStatusImp;

import java.util.ArrayList;
import java.util.List;

import static com.twu.biblioteca.BorrowBookAction.getLoginInfo;

/**
 * Created by cmhu on 03/03/2017.
 */
public class CheckoutMovieAction {
    public static String CheckoutMovie(int movieid,String account) {
        LoginInfo loginInfo = getLoginInfo(account);
        List<Checkout_item> movieList_check=new ArrayList<Checkout_item>();
        GetCheckoutImp checkoutImp=new GetCheckoutImp();
        movieList_check=checkoutImp.getCheckout();
        int flag=0;
        for(int i = 0;i<movieList_check.size();i++){
            if(account==movieList_check.get(i).getUser_libnumber()&&movieList_check.get(i).getMovie_id()==movieid)
            {
                flag=1;
                break;
            }
        }
        if(loginInfo.getStatus()==0||loginInfo==null)
        {
            return "please login";
        }
        else
        {
            if(flag==0)
            {
                return "Pay successfully";
            }
            else
            {
                return "checked out";
            }
        }
    }
}
