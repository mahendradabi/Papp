package com.pepp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

/**
 * Created by MAHI on 05-Feb-18.
 */

public class Login extends AppCompatActivity {
    AppCompatButton createAccount;
    AppCompatTextView forgot_password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bindViews();


    }

    private void bindViews() {
        createAccount = (AppCompatButton) findViewById(R.id.create_account);
        forgot_password = (AppCompatTextView) findViewById(R.id.forgot_password);
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,Singup.class));
            }
        });
         forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,ForgotPassword.class));
            }
        });


    }
}
