package com.google.sps.servlets;

public final class user {
    private final String myname;
    private final String email;
    private final String message;

    public user(String myname, String email, String message) {
        this.myname = myname; 
        this.email = email;
        this.message = message;
    }

    public String getName() {
        return myname;
    }

    public String getEmail() {
        return email;
    }

    public String getuserPassword() {
        return message;
    }
}