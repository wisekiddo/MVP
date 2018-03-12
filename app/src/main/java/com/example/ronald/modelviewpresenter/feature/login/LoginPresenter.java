package com.example.ronald.modelviewpresenter.feature.login;

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
                view.showMessage("Please enter Password and Usename");
            } else {
                //Validate a dummy user
                String username = view.getUsername();
                String passwotd = view.getPassword();
                model.validate(view.getUsername(), view.getPassword());
                view.showMessage("Username: "+ username + " Password: " + passwotd);

            }

        }
    }

    @Override
    public void getCurrentUser() {

        User user = model.getUser();

        if (user != null) {
            if (view != null) {
                view.setPassword(user.getPassword());
                view.setUsername(user.getUsername());
            }
        }

    }
}
