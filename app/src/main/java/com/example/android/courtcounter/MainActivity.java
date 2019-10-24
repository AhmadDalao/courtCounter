package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mTeam_A_score = 0;
    private int mTeam_B_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addThreeTeamA(View view) {
        mTeam_A_score = mTeam_A_score + 3;
        displayScoreA(mTeam_A_score);
    }

    private void displayScoreA(int mTeam_a_score) {
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        textView.setText(String.valueOf(mTeam_a_score));
    }

    public void addTwoTeamA(View view) {
        mTeam_A_score = mTeam_A_score + 2;
        displayScoreA(mTeam_A_score);
    }

    public void addFreeShotTeamA(View view) {
        mTeam_A_score = mTeam_A_score + 1;
        displayScoreA(mTeam_A_score);
    }

    public void addThreeTeamB(View view) {
        mTeam_B_score = mTeam_B_score + 3;
        displayScoreB(mTeam_B_score);
    }

    private void displayScoreB(int mTeam_b_score) {
        TextView textView = (TextView) findViewById(R.id.team_B_score);
        textView.setText(String.valueOf(mTeam_b_score));
    }

    public void addFreeShotTeamB(View view) {
        mTeam_B_score = mTeam_B_score + 1;
        displayScoreB(mTeam_B_score);

    }

    public void addTwoTeamB(View view) {
        mTeam_B_score = mTeam_B_score + 2;
        displayScoreB(mTeam_B_score);

    }

    public void resetScore(View view) {
        mTeam_B_score = 0;
        mTeam_A_score = 0;
        displayScoreB(mTeam_B_score);
        displayScoreA(mTeam_A_score);
    }
}
