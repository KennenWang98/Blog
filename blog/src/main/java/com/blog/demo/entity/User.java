package com.blog.demo.entity;

public class User {
    private int id;

    @Override
    public String toString() {
        return "username='" + username + '\'' +
                ", password='" + password + '\'';
    }

    private String username;
    private String password;

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
