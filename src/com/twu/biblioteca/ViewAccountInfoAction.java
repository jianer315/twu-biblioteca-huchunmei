package com.twu.biblioteca;
import com.twu.bean.LoginInfo;
import com.twu.bean.User;
import com.twu.serviceImp.GetLoginStatusImp;
import com.twu.serviceImp.GetUserImp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 04/03/2017.
 */
public class ViewAccountInfoAction {
    public static String ViewAccountInfo(String account) {
        GetLoginStatusImp getLoginStatusImp = new GetLoginStatusImp();
        List<LoginInfo> loginInfos = new ArrayList<LoginInfo>();
        List<User> userList = new ArrayList<User>();
        loginInfos = getLoginStatusImp.getLoginStatus();
        String info = "";
        GetUserImp getUserImp = new GetUserImp();
        userList = getUserImp.getUserlist();
        for (int i = 0; i < loginInfos.size(); i++) {
            if (account == loginInfos.get(i).getLibnumber() && loginInfos.get(i).getStatus() == 1) {
                info = userList.get(i).getName() + " " + userList.get(i).getEmail() + " " + userList.get(i).getTelnumber();
                return info;
            }
        }
        return "please login";
    }
}
