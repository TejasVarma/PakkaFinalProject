package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cpr5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpr5);
    }

    public void goback(View view){
        Intent abc11 = new Intent(cpr5.this,cpr1.class);
        startActivity(abc11);
    }

}
