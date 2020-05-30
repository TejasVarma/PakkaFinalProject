package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cpr4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpr4);
    }

    public void goback(View view){
        Intent abc9 = new Intent(cpr4.this,cpr1.class);
        startActivity(abc9);
    }

}
