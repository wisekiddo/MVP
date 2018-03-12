package com.example.ronald.modelviewpresenter.root;

import com.example.ronald.modelviewpresenter.feature.login.LoginActivity;
import com.example.ronald.modelviewpresenter.feature.login.LoginModule;

import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by ronald on 6/3/18.
 */

@Singleton
@Component(modules =  {ApplicationModule.class,  LoginModule.class})
public interface ApplicationComponent {
    void inject(LoginActivity target);
}

