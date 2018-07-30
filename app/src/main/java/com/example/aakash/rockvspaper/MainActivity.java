package com.example.aakash.rockvspaper;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button play,exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);
        exit = findViewById(R.id.exit);
//        final Typeface typeface = Typeface.createFromAsset(getAssets(), "font/aldrichregular.ttf");
//        play.setTypeface(typeface);
//        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "font/aldrichregular.ttf");
//        exit.setTypeface(typeface);




    }
    public void playGame(View view){
         startActivity(new Intent(MainActivity.this,SecondActivity.class));

    }
}
