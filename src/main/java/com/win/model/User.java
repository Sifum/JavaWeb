package com.win.model;

import javax.validation.constraints.NotNull;

/**
 * Created by pocan on 2017/5/31.
 */
public class User {
    private int id;

    @NotNull
    private String userName;
    @NotNull
    private int userAge;
    @NotNull
    private String userAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "userId:" + id + ";userName:" + userName + ";userAge:" + userAge + ";userAddress:"+ userAddress;
    }
}
