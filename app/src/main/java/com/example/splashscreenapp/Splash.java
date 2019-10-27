package com.example.splashscreenapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);


        Thread threadTimeSplash = new Thread(){

            @Override
            public void run(){

                try{
                    sleep(3000);
                }catch (Exception e){

                }finally {
                    startActivity(new Intent(Splash.this,MainActivity.class));
                }

            }


        };

        threadTimeSplash.start();



    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
