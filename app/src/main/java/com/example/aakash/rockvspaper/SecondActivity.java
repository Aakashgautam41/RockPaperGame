package com.example.aakash.rockvspaper;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // Get ui elements
    TextView textUser,vs,userWins,pcWins;
    static TextView textPc;
    TextView winner;
    Button rock,paper,scissor;
    MediaPlayer mediaPlayer;

     static int userStat = 0;
     static int pcStat = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Access the ui elements
        textUser = findViewById(R.id.textRock);
        vs = findViewById(R.id.vs);
        textPc = findViewById(R.id.textPaper);
        winner = findViewById(R.id.winner);

        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissor = findViewById(R.id.scissor);

        userWins = findViewById(R.id.userStat);
        pcWins = findViewById(R.id.pcStat);

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textUser.setText("Rock");
                pcTurn();
                String userText = textUser.getText().toString();
                String pcText = textPc.getText().toString();
                Log.i("Tag",pcText);
                Log.i("Tag",userText);

                if (userText=="Rock" && pcText=="Rock"){
                  winner.setText("  Draw");
                  mediaPlayer = MediaPlayer.create(SecondActivity.this,R.raw.draw);
                  mediaPlayer.start();
                }
                else if(userText=="Rock" && pcText=="Paper"){
                    winner.setText("You lost");
                    mediaPlayer = MediaPlayer.create(SecondActivity.this,R.raw.youlose);
                    mediaPlayer.start();

                    pcStat = pcStat+1;
                    String newPcStat = String.valueOf(pcStat);
                    pcWins.setText(newPcStat);
                }
                else if(userText=="Rock" && pcText=="Scissor"){
                    winner.setText("You Win");
                    mediaPlayer = MediaPlayer.create(SecondActivity.this,R.raw.youwin);
                    mediaPlayer.start();

                    userStat = userStat+1;
                    String newUserStat = String.valueOf(userStat);
                    userWins.setText(newUserStat);
                }
            }


        });
        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textUser.setText("Paper");
                pcTurn();
                String userText = textUser.getText().toString();
                String pcText = textPc.getText().toString();
                Log.i("Tag",pcText);
                Log.i("Tag",userText);

                if (userText=="Paper" && pcText=="Paper"){
                    winner.setText("  Draw");
                    mediaPlayer = MediaPlayer.create(SecondActivity.this,R.raw.draw);
                    mediaPlayer.start();
                }
                else if(userText=="Paper" && pcText=="Scissor"){
                    winner.setText("You lost");
                    mediaPlayer = MediaPlayer.create(SecondActivity.this,R.raw.youlose);
                    mediaPlayer.start();

                    pcStat = pcStat+1;
                    String newPcStat = String.valueOf(pcStat);
                    pcWins.setText(newPcStat);
                }
                else if(userText=="Paper" && pcText=="Rock"){
                    winner.setText("You Win");
                    mediaPlayer = MediaPlayer.create(SecondActivity.this,R.raw.youwin);
                    mediaPlayer.start();

                    userStat = userStat+1;
                    String newUserStat = String.valueOf(userStat);
                    userWins.setText(newUserStat);
                }
            }
        });
        scissor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textUser.setText("Scissor");
                pcTurn();
                String userText = textUser.getText().toString();
                String pcText = textPc.getText().toString();
                Log.i("Tag",pcText);
                Log.i("Tag",userText);

                if (userText=="Scissor" && pcText=="Scissor"){
                    winner.setText("  Draw");
                    mediaPlayer = MediaPlayer.create(SecondActivity.this,R.raw.draw);
                    mediaPlayer.start();
                }
                else if(userText=="Scissor" && pcText=="Rock"){
                    winner.setText("You lost");
                    mediaPlayer = MediaPlayer.create(SecondActivity.this,R.raw.youlose);
                    mediaPlayer.start();

                    pcStat = pcStat+1;
                    String newPcStat = String.valueOf(pcStat);
                    pcWins.setText(newPcStat);
                }
                else if(userText=="Scissor" && pcText=="Paper"){
                    winner.setText("You Win");
                    mediaPlayer = MediaPlayer.create(SecondActivity.this,R.raw.youwin);
                    mediaPlayer.start();

                    userStat = userStat+1;
                    String newUserStat = String.valueOf(userStat);
                    userWins.setText(newUserStat);
                }
            }
        });


    }
    public String pcTurn() {
        String[] turnArray = new String[3];
        turnArray[0]="Rock";
        turnArray[1]="Paper";
        turnArray[2]="Scissor";

        int rand = (int) (Math.random()*3);
        textPc.setText(turnArray[rand]);
        String pcText = textPc.toString();
        Log.i("ArrayValue", String.valueOf(turnArray[0]));
        Log.i("randValue", String.valueOf(rand));
        return pcText;
    }
}
