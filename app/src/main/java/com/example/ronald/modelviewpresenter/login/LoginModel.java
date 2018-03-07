package com.example.ronald.modelviewpresenter.login;

import com.example.ronald.modelviewpresenter.login.model.User;

/**
 * Created by ronald on 7/3/18.
 */

public class LoginModel implements LoginInterface.Model {

    private LoginInterface.Repository repository;

    public LoginModel(LoginInterface.Repository repository) {
        this.repository = repository;
    }


    @Override
    public Boolean validate(String username, String password) {

        if(username.contentEquals(password)){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public User getUser() {
        return null;
    }
}
