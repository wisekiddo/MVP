package com.example.ronald.modelviewpresenter.feature.login;

import com.example.ronald.modelviewpresenter.model.User;

/**
 * Created by ronald on 7/3/18.
 */

public class LoginRepository implements LoginInterface.Repository{

    private User user;

    @Override
    public User getUser() {

        System.out.print("Request for getUser");
        if (user == null) {
            User user = new User("Ronald", "Bernardo");
            user.setId(0);
            return user;
        } else {
            return user;
        }

    }

    @Override
    public void addUser(User user) {

        System.out.print("Adding new user");

        if (user == null) {
            user = getUser();
        }

        this.user = user;

    }


}
