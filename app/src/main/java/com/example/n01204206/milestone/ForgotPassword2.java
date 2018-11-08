package com.example.n01204206.milestone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword2 extends AppCompatActivity {

    private EditText pwd1,pwd2;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password2);

        pwd1 = (EditText)findViewById(R.id.new_password);
        pwd2 = (EditText)findViewById(R.id.confirm_password);
        submit = (Button)findViewById(R.id.submission);

        submit.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               Intent confirmed = new Intent(ForgotPassword2.this,Main2Activity.class);
               startActivity(confirmed);
           }
        });
    }
}
