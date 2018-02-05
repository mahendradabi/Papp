package com.pepp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;

/**
 * Created by MAHI on 05-Feb-18.
 */

public class ForgotPassword extends AppCompatActivity {
    AppCompatButton createAccount;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

}
