package com.twu.biblioteca;
import com.twu.bean.Checkout_item;
import com.twu.bean.LoginInfo;
import com.twu.serviceImp.GetCheckoutImp;
import com.twu.serviceImp.GetLoginStatusImp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 03/03/2017.
 */
public class WatchMovieAction {
    public static String WatchMovie(String account, int movieid) {
        List<Checkout_item> movieList_check = new ArrayList<Checkout_item>();
        GetCheckoutImp checkoutImp = new GetCheckoutImp();
        movieList_check = checkoutImp.getCheckout();
        int flag = 0;
        GetLoginStatusImp getLoginStatusImp = new GetLoginStatusImp();
        List<LoginInfo> loginInfos = new ArrayList<LoginInfo>();
        loginInfos = getLoginStatusImp.getLoginStatus();
        LoginInfo loginInfo = new LoginInfo();
        System.out.println(loginInfo);
        for (int i = 0; i < loginInfos.size(); i++) {
            if (account == loginInfos.get(i).getLibnumber()) {
                loginInfo = loginInfos.get(i);
            }
        }
        if (loginInfo.getStatus() == 1) {
            for (int i = 0; i < movieList_check.size(); i++) {

                if (movieList_check.get(i).getUser_libnumber() == account && movieList_check.get(i).getMovie_id() == movieid && movieid > 0) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 1) {
                return "you can watch movie!";
            } else {
                return "please check out for watching";
            }
        } else {
            return "please login";
        }
    }
}
