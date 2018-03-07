package com.example.ronald.modelviewpresenter.login;

import com.example.ronald.modelviewpresenter.login.model.User;

/**
 * Created by ronald on 6/3/18.
 */

public interface LoginInterface {

    interface Model {

        Boolean validate(String username, String password);
        User getUser();

    }

    interface View{

        String getUsername();
        String getPassword();

        void setPassword(String password);
        void setUsername(String username);

        void showMessage();

    }

    interface Presenter {

        void setView(LoginInterface.View view);
        void loginButtonClicked();
        void getCurrentUser();

    }

    interface Repository {
        User getUser();
        void addUser(User user);
    }


}
