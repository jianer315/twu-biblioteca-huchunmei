package com.twu.bean;

/**
 * Created by Administrator on 2017/2/25.
 */
public class User {
    private String libnumber;
    private String password;
    private String name;
    private String email;
    private String telnumber;
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLibnumber() {
        return libnumber;
    }

    public void setLibnumber(String libnumber) {
        this.libnumber = libnumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }
}
