package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.appsearch.SearchResult;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent ihome =new Intent( splashActivity.this, MainActivity.class);

         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 startActivity(ihome);
                 finish();
             }
         },  4000);

    }
}