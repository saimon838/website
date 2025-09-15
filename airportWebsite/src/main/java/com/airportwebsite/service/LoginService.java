package com.airportwebsite.service;

public class LoginService {
    public boolean authenticate(String username, String password) {
        // Simple check; replace with DB query
        return "admin".equals(username) && "password".equals(password);
    }
}