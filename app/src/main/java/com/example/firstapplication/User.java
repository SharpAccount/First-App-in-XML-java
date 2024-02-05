package com.example.firstapplication;

import android.util.Log;

import java.io.Serializable;

public class User {
    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String _login) {
        login = _login;
    }

    public void setPassword(String _password) {
        password = _password;
    }

    public User(String _login, String _password){
        login = _login;
        password = _password;
    }
}
