package com.wakeup.wakeup.ObjectClass;

public class User {

    private String email;

    public User() {
    }

    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    // check email exists -->signup, checkpw
}