package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cpr2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpr2);
    }

    public void goback(View view){
        Intent abc8 = new Intent(cpr2.this,cpr1.class);
        startActivity(abc8);
    }

}
