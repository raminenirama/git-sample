package com.example.rama.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Rama on 05-02-2016.
 */
public class ActivityB extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Show the string value of the singleton
        Toast.makeText(getApplicationContext(), Singleton.getInstance().getString(), Toast.LENGTH_SHORT).show();
    }
}
