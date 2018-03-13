package com.mokapos.ronald.modelviewpresenter.feature.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mokapos.ronald.modelviewpresenter.R;

import com.mokapos.ronald.modelviewpresenter.feature.FeatureBaseActivity;
import com.mokapos.ronald.modelviewpresenter.root.ApplicationBase;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends FeatureBaseActivity implements LoginInterface.View{

    @Inject LoginInterface.Presenter presenter;

    @BindView(R.id.txtUsername) TextView txtUsername;
    @BindView(R.id.txtPassword) TextView txtPassword;
    @BindView(R.id.btnLogin) Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        ((ApplicationBase) getApplication()).getComponent().inject(this);
    }

    @OnClick(R.id.btnLogin)
    void onLogin(View view){
        presenter.loginButtonClicked();
    }

    @Override
    public String getUsername() {
        return txtUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return txtPassword.getText().toString();
    }

    @Override
    public void setPassword(String usename) {
        txtUsername.setText(usename);
    }

    @Override
    public void setUsername(String password) {
        txtPassword.setText(password);

    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

}
