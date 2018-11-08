package com.example.n01204206.milestone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmationActivity extends AppCompatActivity {

    private TextView message;
    private EditText code;
    private Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        message = (TextView)findViewById(R.id.note);
        code = (EditText)findViewById(R.id.code);
        enter = (Button)findViewById(R.id.enter);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent confirmation = new Intent(ConfirmationActivity.this,ForgotPassword2.class);
                startActivity(confirmation);
            }
        });
    }
}
