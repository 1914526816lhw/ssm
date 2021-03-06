package com.ssm.entity;

import java.io.Serializable;

/**
 * ClassName：User
 * Description：
 *
 * @author lihw
 * CreateTime: 2020/7/4 19:06
 * @version 1.0.0
 */
public class Users implements Serializable {

    private int userId;
    private String userName;
    private String userSex;
    private int userAge;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
