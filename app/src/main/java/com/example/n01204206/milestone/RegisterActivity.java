package com.example.n01204206.milestone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private View view;
    private EditText fullName, usernameID, mobileNumber, password, confirmPassword;
    private TextView login;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullName = (EditText)findViewById(R.id.fullname);
        usernameID = (EditText)findViewById(R.id.usernameID);
        mobileNumber = (EditText)findViewById(R.id.mobileNumber);
        password = (EditText)findViewById(R.id.password);
        confirmPassword = (EditText)findViewById(R.id.confirmPassword);
        login = (TextView)findViewById(R.id.already_user);
        signUpButton = (Button)findViewById(R.id.signUpButton);

        login.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view){
                Intent i = new Intent(RegisterActivity.this,LoginScreen.class);
                startActivity(i);
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
             Intent i = new Intent(RegisterActivity.this,Main2Activity.class);
             startActivity(i);
            }
        });

    }
}
