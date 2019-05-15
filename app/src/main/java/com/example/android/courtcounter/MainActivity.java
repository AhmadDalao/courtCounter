package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAscore = 0;
    int teamBscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreTeamB(0);
        displayScoreTeamA(0);
    }


    public void displayScoreTeamA(int scoreA) {
        TextView textView = (TextView) findViewById(R.id.scoreA);
        textView.setText(String.valueOf(scoreA));
    }

    public void displayScoreTeamB(int scoreB) {
        TextView textView = (TextView) findViewById(R.id.scoreB);
        textView.setText(String.valueOf(scoreB));
    }

    public void AddThreeTeamA(View view) {
        teamAscore += 3;
        displayScoreTeamA(teamAscore);
    }

    public void AddTwoTeamA(View view) {
        teamAscore += 2;
        displayScoreTeamA(teamAscore);
    }

    public void AddFreeThrowTeamA(View view) {
        teamAscore += 1;
        displayScoreTeamA(teamAscore);
    }

    public void AddThreeTeamB(View view) {
        teamBscore += 3;
        displayScoreTeamB(teamBscore);
    }

    public void AddTwoTeamB(View view) {
        teamBscore += 2;
        displayScoreTeamB(teamBscore);
    }

    public void AddFreeThrowTeamB(View view) {
        teamBscore += 1;
        displayScoreTeamB(teamBscore);
    }

    public void reset(int resetA, int resetB) {
        TextView resetATo = (TextView) findViewById(R.id.scoreA);
        resetATo.setText(String.valueOf(resetA));

        TextView resetBTo = (TextView) findViewById(R.id.scoreB);
        resetBTo.setText(String.valueOf(resetB));
    }

    public void resetScore(View view) {
        teamBscore = 0;
        teamAscore = 0;
        reset(teamAscore, teamBscore);
        //  displayScoreTeamA(teamAscore);
        //displayScoreTeamB(teamBscore);

    }


}
