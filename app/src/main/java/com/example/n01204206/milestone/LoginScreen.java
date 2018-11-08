package com.example.n01204206.milestone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.text.InputType;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.CompoundButton;
import android.widget.CheckBox;

public class LoginScreen extends AppCompatActivity {

    private EditText loginUsername, loginPassword;
    private Button login_button;
    private TextView forgotPassword, signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        loginUsername = (EditText) findViewById(R.id.login_username);
        loginPassword = (EditText) findViewById(R.id.login_password);
        login_button = (Button) findViewById(R.id.login_button);
        forgotPassword = (TextView) findViewById(R.id.forgot_password);
        signUp = (TextView) findViewById(R.id.createAccount);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginpage = new Intent(LoginScreen.this, Main2Activity.class);
                startActivity(loginpage);
            }
        });

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginpage = new Intent(LoginScreen.this, ForgotPassword.class);
                startActivity(loginpage);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginpage = new Intent(LoginScreen.this, RegisterActivity.class);
                startActivity(loginpage);
            }
        });
    }

}