package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cpr1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpr1);
    }

    public void cpr2(View view){
        Intent abc1 = new Intent(cpr1.this,cpr2.class);
        startActivity(abc1);
    }

    public void cpr3(View view){
        Intent abc2 = new Intent(cpr1.this,cpr3.class);
        startActivity(abc2);
    }

    public void cpr4(View view){
        Intent abc3 = new Intent(cpr1.this,cpr4.class);
        startActivity(abc3);
    }

    public void cpr5(View view){
        Intent abc4 = new Intent(cpr1.this,cpr5.class);
        startActivity(abc4);
    }

    public void cpr6(View view){
        Intent abc5 = new Intent(cpr1.this,cpr6.class);
        startActivity(abc5);
    }

    public void goback(View view){
        Intent abc7 = new Intent(cpr1.this,More.class);
        startActivity(abc7);
    }

}
