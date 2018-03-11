package com.example.ronald.modelviewpresenter.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ronald.modelviewpresenter.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements LoginInterface.View{

    @BindView(R.id.txtUsername) TextView txtUsername;
    @BindView(R.id.txtPassword) TextView txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

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
    public void showMessage() {
        Toast.makeText(this, "Password and Username", Toast.LENGTH_SHORT).show();
    }
}
