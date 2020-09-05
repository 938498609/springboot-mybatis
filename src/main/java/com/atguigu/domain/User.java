package com.atguigu.domain;

import java.io.Serializable;

/**
 * @author lswstart
 * @create 2020-09-02-15:19
 */
public class User implements Serializable {
    // 主键
    private Integer id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 姓名
    private String name;

    //此处省略getter和setter方法 .. ..


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

