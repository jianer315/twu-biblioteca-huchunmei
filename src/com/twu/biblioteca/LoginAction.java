package com.twu.biblioteca;
import com.twu.bean.User;
import com.twu.serviceImp.GetUserImp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/26.
 */
public class LoginAction {
    public static String Login(String account, String password) {
        List<User> userList = new ArrayList<User>();
        GetUserImp getUserImp = new GetUserImp();
        userList = getUserImp.getUserlist();
        int flag = 0;
        for (int i = 0; i < userList.size(); i++) {
            if (account.equals(userList.get(i).getLibnumber()) && password.equals(userList.get(i).getPassword())) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            return "Login Successfully";
        } else {
            return "Login fail";
        }
    }
}
