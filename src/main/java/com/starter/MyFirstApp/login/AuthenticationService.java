package com.starter.MyFirstApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password) {

        boolean isValidUserName = username.equalsIgnoreCase("Chuks");
        boolean isValidPassword = password.equalsIgnoreCase("password");

        return isValidUserName && isValidPassword;
    }
}