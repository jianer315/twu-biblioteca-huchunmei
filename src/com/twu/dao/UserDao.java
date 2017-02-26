package com.twu.dao;

import com.twu.bean.User;

/**
 * Created by Administrator on 2017/2/25.
 */
public class UserDao {

    public User finduser()
    {   User user=new User();
        user.setUserName("huchunmei");
        user.setPassword("123456");
        return  user;
    }

}
