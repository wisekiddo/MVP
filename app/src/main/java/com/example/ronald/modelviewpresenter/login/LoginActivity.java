package com.example.ronald.modelviewpresenter.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ronald.modelviewpresenter.R;

public class LoginActivity extends AppCompatActivity implements LoginInterface.View{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void setPassword(String firstName) {

    }

    @Override
    public void setUsername(String lastName) {

    }

    @Override
    public void showMessage() {

    }
}
