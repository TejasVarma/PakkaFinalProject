package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class More extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);


    }

    public void video(View view){
        Intent intent = new Intent(More.this,Video.class);
        startActivity(intent);

    }

    public void weight(View view){
        Intent in = new Intent(More.this,WeightActivity.class);
        startActivity(in);
    }

    public void Emergency(View view){
        Intent yo = new Intent(More.this,EmergencyContacts.class);
        startActivity(yo);
    }


}
