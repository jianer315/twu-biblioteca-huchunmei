package com.twu.biblioteca;

import com.twu.bean.User;
import org.omg.CORBA.UserException;

/**
 * Created by Administrator on 2017/2/26.
 */
public class LoginAction {
   public int Login(String username,String password)
    {
        User user=new User();
        String uname=user.getUserName();
        String pword=user.getPassword();
        if(uname==username&&pword==password)
            return 1;
        else
            return 0;

    }
}
