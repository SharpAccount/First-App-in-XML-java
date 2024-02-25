package com.example.firstapplication;

import android.util.Log;

import java.io.Serializable;

public class User implements Serializable {
    private String email;
    private String password;

    public String Email() {
        return email;
    }

    public void Email(String _email) {
        email = _email;
    }
    public String Password() {
        return password;
    }
    public void Password(String _password) {
        password = _password;
    }


    public User(String _email, String _password){
        email = _email;
        password = _password;
    }
}
