package com.shirotest.demo;

import java.io.Serializable;

/**
 * 程序名：.java<br>
 * 日期：2019-03-01 15:01 <br>
 * ActivityMq   HX   2019-03-01 15:01
 */
public class User implements Serializable {
    private String name;

    private String password;


    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
