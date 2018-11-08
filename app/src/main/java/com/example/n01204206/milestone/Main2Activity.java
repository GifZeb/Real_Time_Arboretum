package com.example.n01204206.milestone;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    private View quit,account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dl = (DrawerLayout)findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {
                    case R.id.account:
                     //   Toast.makeText(Main2Activity.this, "My Account",Toast.LENGTH_SHORT).show();
                        account.setOnClickListener(new View.OnClickListener(){
                            public void onClick(View view){

                                Intent i = new Intent(Main2Activity.this,LoginScreen.class);
                                startActivity(i);

                            }
                        });
                    case R.id.settings:
                        Toast.makeText(Main2Activity.this, "Settings",Toast.LENGTH_SHORT).show();
                    case R.id.mycart:
                       // Toast.makeText(Main2Activity.this, "quit",Toast.LENGTH_SHORT).show();
                        quit.setOnClickListener(new View.OnClickListener(){

                            public void onClick(View v){

                                Intent iy = new Intent(Main2Activity.this,LoginScreen.class);
                                startActivity(iy);

                            }
                        });
                        default:
                        return true;
                }




            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);

    }
}
