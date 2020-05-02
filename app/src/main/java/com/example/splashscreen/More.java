package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class More extends AppCompatActivity {

    private SharedPreferenceConfig preferenceConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

        preferenceConfig = new SharedPreferenceConfig(getApplicationContext());
    }

    public void userLogout(View view) {
        preferenceConfig.writeLoginStatus(false);
        startActivity(new Intent(this, Login.class));
        finish();
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

    public void back(View view){
        Intent aaa = new Intent(More.this,Home.class);
        startActivity(aaa);
    }

}
