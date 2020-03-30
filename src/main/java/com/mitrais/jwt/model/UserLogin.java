package com.mitrais.jwt.model;

public class UserLogin {
    private String username;
    private String pass;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
