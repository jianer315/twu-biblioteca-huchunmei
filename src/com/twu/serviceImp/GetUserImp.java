package com.twu.serviceImp;

import com.twu.bean.User;
import com.twu.service.GetUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/25.
 */
public class GetUserImp implements GetUser {
    @Override
    public List getUserlist() {
        List<User> userList=new ArrayList<User>();
        User user1=new User();
        user1.setLibnumber("no-1");
        user1.setName("huhu");
        user1.setPassword("12345612");
        user1.setEmail("99999@qq.com");
        user1.setTelnumber("1111111");
        user1.setRole("user");

        User user2=new User();
        user2.setLibnumber("no-2");
        user2.setName("cc");
        user2.setPassword("123");
        user2.setEmail("3463@qq.com");
        user2.setTelnumber("22222222");
        user2.setRole("user");

        User user3=new User();
        user3.setLibnumber("no-3");
        user3.setName("mm");
        user3.setPassword("789");
        user3.setEmail("346312@qq.com");
        user3.setTelnumber("3333333");
        user3.setRole("user");

        User user4=new User();
        user4.setLibnumber("no-4");
        user4.setName("cm");
        user4.setPassword("8999");
        user4.setEmail("34cf12@qq.com");
        user4.setTelnumber("44444444");

        User user5=new User();
        user5.setRole("admin");
        user5.setLibnumber("no-admin");
        user5.setPassword("123");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        return userList;
    }
}
