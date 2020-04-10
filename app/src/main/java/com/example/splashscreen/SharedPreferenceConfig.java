package com.example.splashscreen;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceConfig {

    private SharedPreferences sharedPreference;
    private Context context;

    public SharedPreferenceConfig(Context context) {
        this.context = context;
        sharedPreference = context.getSharedPreferences(context.getResources().getString(R.string.login_preference),Context.MODE_PRIVATE);

    }

    public void writeLoginStatus(boolean status){
        SharedPreferences . Editor editor = sharedPreference.edit();
        editor.putBoolean(context.getResources().getString(R.string.login_status_preference),status);
        editor.commit();
    }
    public boolean readLoginStatus(){
        boolean status = false;
        status = sharedPreference.getBoolean(context.getResources().getString(R.string.login_status_preference),false);
        return   status;
    }

}
