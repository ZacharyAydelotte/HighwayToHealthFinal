package com.example.highwaytohealth;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.media.MediaPlayer;


public class MainActivity extends WearableActivity {

    private TextView mTextView;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.h2h);

        mTextView = (TextView) findViewById(R.id.mTextView);
        // final Button cal = findViewById(R.id.calcButton);
        //final Button bmi = findViewById(R.id.bmiButton);
        //final Button heart = findViewById(R.id.heartButton);

        mediaPlayer.start();


        // Enables Always-on
         setAmbientEnabled();
        }

        public void onloadcalCButtonClicked (View view){
            Intent my_intent = new Intent(getBaseContext(), CalorieCalculator.class);
            startActivity(my_intent);
        }
        public void onloadbmiButtonClicked (View view){
            Intent my_intent = new Intent(getBaseContext(), BMI.class);
            startActivity(my_intent);
        }
        public void onloadheartButtonClicked (View view){
            Intent my_intent = new Intent(getBaseContext(), HeartMonitor.class);
            startActivity(my_intent);
        }

    }