package com.mokapos.ronald.modelviewpresenter.root;

import com.mokapos.ronald.modelviewpresenter.feature.login.LoginActivity;
import com.mokapos.ronald.modelviewpresenter.feature.login.LoginModule;

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

