package com.example.aakash.rockvspaper;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button play,exit;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);
        exit = findViewById(R.id.exit);

        mediaPlayer = MediaPlayer.create(this,R.raw.gametune);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();
                System.exit(0);
            }
        });

    }
    public void playGame(View view){
         startActivity(new Intent(MainActivity.this,SecondActivity.class));
         mediaPlayer.stop();

    }
}
