package com.twu.serviceImp;

import com.twu.bean.LoginInfo;
import com.twu.service.GetLoginStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmhu on 04/03/2017.
 */
public class GetLoginStatusImp implements GetLoginStatus {
    @Override
    public List<LoginInfo> getLoginStatus() {
        List<LoginInfo> loginInfos=new ArrayList<LoginInfo>();
        LoginInfo loginInfo1=new LoginInfo();
        loginInfo1.setLibnumber("no-1");
        loginInfo1.setStatus(1);

        LoginInfo loginInfo2=new LoginInfo();
        loginInfo2.setLibnumber("no-2");
        loginInfo2.setStatus(1);

        LoginInfo loginInfo3=new LoginInfo();
        loginInfo3.setLibnumber("no-3");
        loginInfo3.setStatus(0);

        LoginInfo loginInfo4=new LoginInfo();
        loginInfo4.setLibnumber("no-4");
        loginInfo4.setStatus(0);

        LoginInfo loginInfo5=new LoginInfo();
        loginInfo5.setLibnumber("no-admin");
        loginInfo5.setStatus(0);
        loginInfos.add(loginInfo1);
        loginInfos.add(loginInfo2);
        loginInfos.add(loginInfo3);
        loginInfos.add(loginInfo4);
        loginInfos.add(loginInfo5);
        return loginInfos;
    }
}
