package com.zywie.android.zywie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClick(View view){
        if(view.getId()==R.id.home_btn_signin){
            Intent x = new Intent(this,HomeSignIn.class);
            startActivity(x);

        }
        if(view.getId()==R.id.home_btn_signup){
            Intent i = new Intent(this,HomeSignUp.class);
            startActivity(i);

        }

    }
}
