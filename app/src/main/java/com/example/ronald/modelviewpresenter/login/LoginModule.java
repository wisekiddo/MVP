package com.example.ronald.modelviewpresenter.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ronald on 6/3/18.
 *
 * Module specifies all the providers of the injection for the current Feature
 * in our case, we will define a Provider that provides a
 * - new LoginPresenter(), new LoginModel() and loginRepository()
 */


@Module
public class LoginModule {

    @Provides
    public LoginInterface.Presenter provideLoginActivityPresenter(LoginInterface.Model model){
        return new LoginPresenter(model);
    }

    @Provides
    public LoginInterface.Model provideLoginActivityModel(LoginInterface.Repository repository){
        return new LoginModel(repository);
    }

    @Provides
    public LoginInterface.Repository provideLoginRepository(){
        return new LoginRepository();
    }

}