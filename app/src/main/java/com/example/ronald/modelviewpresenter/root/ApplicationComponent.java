package com.example.ronald.modelviewpresenter.root;

import com.example.ronald.modelviewpresenter.login.LoginActivity;
import com.example.ronald.modelviewpresenter.login.LoginInterface;
import com.example.ronald.modelviewpresenter.login.LoginModule;
import com.example.ronald.modelviewpresenter.login.LoginPresenter;

import javax.inject.Singleton;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by ronald on 6/3/18.
 */

@Singleton
@Component(modules =  {ApplicationModule.class,  LoginModule.class})
public interface ApplicationComponent {
    void inject(LoginActivity target);
}

