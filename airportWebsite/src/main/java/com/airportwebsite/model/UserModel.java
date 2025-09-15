package com.airportwebsite.model;

public class UserModel {
    private String username;
    private String password;
    private String email;

    // Constructors, getters, setters
    public UserModel() {}
    public UserModel(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    // Getters and setters...
}