package com.zywie.android.zywie;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class HomeSignUp extends AppCompatActivity {
    private DatabaseReference mDatabase;
    private EditText fname,lname,email,pass,confirmPass;
    private boolean success = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sign_up);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        fname = (EditText) findViewById(R.id.signup_firstName);
        lname = (EditText) findViewById(R.id.signup_lastName);
        email = (EditText) findViewById(R.id.signup_emailAddress);
        pass = (EditText) findViewById(R.id.signup_password);
        confirmPass = (EditText) findViewById(R.id.signup_confirmPassword);
    }

    public void onButtonClick(View view){
        if(view.getId()==R.id.signup_btn_signin){
            Intent i = new Intent(this,HomeSignIn.class);
            startActivity(i);
        }

        if(view.getId()==R.id.signup_btn_signup){

            String firname,lasname,usemail,uspass,usconfirmPass;
            firname = fname.getText().toString().trim();
            lasname = lname.getText().toString().trim();
            usemail = email.getText().toString().trim();
            uspass = pass.getText().toString().trim();
            usconfirmPass = confirmPass.getText().toString().trim();

            HashMap<String,String> dataMap = new HashMap<String, String>();
            dataMap.put("Fname", firname);
            dataMap.put("Lname",lasname);
            dataMap.put("email",usemail);
            dataMap.put("pass",usconfirmPass);

            mDatabase.push().setValue(dataMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(HomeSignUp.this,"Registration Successful.", Toast.LENGTH_LONG).show();
                        success=true;
                    }else{
                        Toast.makeText(HomeSignUp.this,"Registration Failed.", Toast.LENGTH_LONG).show();

                    }
                }

            });
            if(success) {
                Intent i = new Intent(this, HomeSignIn.class);
                startActivity(i);
            }
        }

    }
}
