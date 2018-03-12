package com.example.ronald.modelviewpresenter.login;

import com.example.ronald.modelviewpresenter.login.model.User;

/**
 * Created by ronald on 7/3/18.
 */

public class LoginRepository implements LoginInterface.Repository{

    private User user;

    @Override
    public User getUser() {

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

        if (user == null) {
            user = getUser();
        }

        this.user = user;

    }


}
