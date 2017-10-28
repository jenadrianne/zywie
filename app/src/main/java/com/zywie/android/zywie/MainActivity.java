package com.zywie.android.zywie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSignUp, btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignUp  =  (Button)findViewById(R.id.linkToSignUp);
        btnSignIn  =  (Button)findViewById(R.id.linkToSignIn);


        btnSignIn.setOnClickListener( new View.OnClickListener() {
            public void onClick (View view){
                Intent signIn = new Intent (MainActivity.this, homeSignIn.class);
                startActivity(signIn);
            }
        });


        btnSignUp.setOnClickListener( new View.OnClickListener() {
            public void onClick (View view){
                Intent signUp = new Intent (MainActivity.this, homeSignUp.class);
                startActivity(signUp);
            }
        });
    }
}
