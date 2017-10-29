package com.zywie.android.zywie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeSignIn extends AppCompatActivity {

    Button btnSignIn, btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sign_in);

        btnSignUp  =  (Button)findViewById(R.id.btnSignUp);
        btnSignIn  =  (Button)findViewById(R.id.btnSignIn);


        btnSignIn.setOnClickListener( new View.OnClickListener() {
            public void onClick (View view){
                Intent signIn = new Intent (homeSignIn.this, landingNav.class);
                startActivity(signIn);
            }
        });


        btnSignUp.setOnClickListener( new View.OnClickListener() {
            public void onClick (View view){
                Intent signUp = new Intent (homeSignIn.this, homeSignUp.class);
                startActivity(signUp);
            }
        });
    }
}
