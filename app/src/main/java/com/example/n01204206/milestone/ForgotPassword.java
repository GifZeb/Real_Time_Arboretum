package com.example.n01204206.milestone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {

    private View view;
    private TextView reenterUsername;
    private EditText usernameId;
    private TextView submit,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        usernameId = (EditText)findViewById(R.id.usernameid);
        reenterUsername = (TextView)findViewById(R.id.reenter_username);
        submit = (TextView)findViewById(R.id.forgot_button);
        back = (TextView)findViewById(R.id.backto_loginbutton);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i = new Intent(ForgotPassword.this,ConfirmationActivity.class);
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent i = new Intent(ForgotPassword.this,LoginScreen.class);
                startActivity(i);
            }
        });
    }
}
