package com.twu.biblioteca;

/**
 * Created by Administrator on 2017/2/26.
 */
public class LoginAction {
    public static int Login(String username, String password) {
        if (username == "huchunmei" && password == "123456") {
            return 1;
        } else {
            return 0;
        }
    }
}
