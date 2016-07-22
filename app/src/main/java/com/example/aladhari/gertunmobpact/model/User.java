package com.example.aladhari.gertunmobpact.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by aladhari on 15.07.2016.
 */
@IgnoreExtraProperties
public class User {

    public String username;
    public String email;

    public User() {
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
