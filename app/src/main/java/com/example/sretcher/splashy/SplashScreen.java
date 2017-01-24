package com.example.sretcher.splashy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    //Credit to Humayun Kabir

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Threads are like methods;actions that are performed when called

        Thread myThread = new Thread() {

            public void run() {

                //Sleeps for 3 seconds, Intent switches java classes which changes activities

                try {

                    sleep(3000);
                    Intent myIntent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(myIntent);
                    finish();
                }

                //Prints out errors

                catch (InterruptedException e) {

                    e.printStackTrace();


                }


            }

        };

        //Start thread

        myThread.start();


    }
}
