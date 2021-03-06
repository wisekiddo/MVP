package com.example.ronald.modelviewpresenter.root;

import android.app.Application;

import com.example.ronald.modelviewpresenter.login.LoginModule;

/**
 * Created by ronald on 6/3/18.
 */

public class ApplicationBase extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate(){
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }

}

