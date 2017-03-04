package com.twu.biblioteca;

import com.twu.bean.User;
import com.twu.serviceImp.GetUserImp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/26.
 */
public class LoginAction {
    public static int Login(String account, String password) {
        List<User> userList=new ArrayList<User>();
        GetUserImp getUserImp=new GetUserImp();
        userList=getUserImp.getUserlist();
        for(int i=0;i<userList.size();i++)
        {
            if(account==userList.get(i).getLibnumber()&&password==userList.get(i).getPassword())
            {
                return 1;
            }
        }
            return 0;
}
}
