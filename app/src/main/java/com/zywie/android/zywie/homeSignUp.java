package com.zywie.android.zywie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeSignUp extends AppCompatActivity {

    Button btnSignUp, btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sign_up);

        btnSignUp  =  (Button)findViewById(R.id.btnSignUp);
        btnSignIn  =  (Button)findViewById(R.id.btnSignIn);


        btnSignIn.setOnClickListener( new View.OnClickListener() {
            public void onClick (View view){
                Intent signIn = new Intent (homeSignUp.this, homeSignIn.class);
                startActivity(signIn);
            }
        });


        btnSignUp.setOnClickListener( new View.OnClickListener() {
            public void onClick (View view){
                Intent signUp = new Intent (homeSignUp.this, homeSignIn.class);
                startActivity(signUp);
            }
        });
    }
}
