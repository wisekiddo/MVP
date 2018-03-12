package com.example.ronald.modelviewpresenter.login;

import android.support.annotation.Nullable;

import com.example.ronald.modelviewpresenter.model.User;

/**
 * Created by ronald on 6/3/18.
 */

public class LoginPresenter implements LoginInterface.Presenter{

    @Nullable
    private LoginInterface.View view;
    private LoginInterface.Model model;

    public LoginPresenter(LoginInterface.Model model) {
        this.model = model;
    }

    @Override
    public void setView(LoginInterface.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonClicked() {
        if (view != null) {
            if (view.getUsername().trim().equals("") || view.getPassword().trim().equals("")) {
                //view.showInputError();
            } else {
                //Validate a dummy user
                model.validate(view.getUsername(), view.getPassword());
                view.showMessage();

            }

        }
    }

    @Override
    public void getCurrentUser() {

        User user = model.getUser();

        if (user != null) {
            if (view != null) {
                view.setPassword(user.getFirstName());
                view.setUsername(user.getLastName());
            }
        }

    }
}
