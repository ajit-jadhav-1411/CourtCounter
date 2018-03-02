package com.example.ajit.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //score will be 0 first
    int scoreA = 0;
    int scoreB = 0;

    //scores for Team A

    public void display3ForA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void display2ForA(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void display1ForA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }



    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //scores for Team B

    public void display3ForB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void display2ForB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void display1ForB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void reset(View v){
        scoreB = 0;
        scoreA = 0;
        /*TextView resetA = (TextView) findViewById(R.id.teamA_a_score);
        resetA.setText(String.valueOf(scoreA));
        TextView resetB = (TextView) findViewById(R.id.teamB_a_score);
        resetB.setText(String.valueOf(scoreB));*/
        displayForTeamA(scoreA); displayForTeamB(scoreB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
