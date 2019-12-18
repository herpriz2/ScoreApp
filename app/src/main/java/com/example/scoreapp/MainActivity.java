package com.example.scoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int redCardTeamA = 0;
    int redCardTeamB = 0;

    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;

    int faultTeamA = 0;
    int faultTeamB = 0;

    int cornerTeamA = 0;
    int cornerTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneGoalForTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addOneRedCardForTeamA(View v){
        redCardTeamA = redCardTeamA + 1;
        displayForTeamA(redCardTeamA);
    }

    public void addOneYellowCardForTeamA(View v){
        yellowCardTeamA = yellowCardTeamA + 1;
        displayForTeamA(yellowCardTeamA);
    }

    public void addOneFaultForTeamA(View v){
        faultTeamA = faultTeamA + 1;
        displayForTeamA(faultTeamA);
    }

    public void addOneCornerForTeamA(View v){
        cornerTeamA = cornerTeamA + 1;
        displayForTeamA(cornerTeamA);
    }

    public void addOneGoalForTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addOneRedCardForTeamB(View v){
        redCardTeamB = redCardTeamB + 1;
        displayForTeamB(redCardTeamB);
    }

    public void addOneYellowCardForTeamB(View v){
        yellowCardTeamB = yellowCardTeamB + 1;
        displayForTeamA(yellowCardTeamB);
    }

    public void addOneFaultForTeamB(View v){
        faultTeamB = faultTeamB + 1;
        displayForTeamB(faultTeamB);
    }

    public void addOneCornerForTeamB(View v){
        cornerTeamB = cornerTeamB + 1;
        displayForTeamB(cornerTeamB);
    }

    public void resetScore (View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
