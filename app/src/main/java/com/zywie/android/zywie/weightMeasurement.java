package com.zywie.android.zywie;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class weightMeasurement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_measurement);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button weight_add = (Button) findViewById(R.id.btn_Add);

        weight_add.setOnClickListener( new View.OnClickListener() {
            public void onClick (View view){
                Intent signIn = new Intent ( weightMeasurement.this, addWeightMeasurement.class);
                startActivity(signIn);
            }
        });
    }

}
