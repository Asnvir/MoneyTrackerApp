package com.example.moneytracker.data;

import com.example.moneytracker.util.Constants;

import java.util.HashMap;
import java.util.Map;

public class UserInfoModel {
    private String uid;
    private String name;
    private String email;

    public UserInfoModel() {
    }

    public UserInfoModel(String uid, String name, String email) {
        this.uid = uid;
        this.name = name;
        this.email = email;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

}
