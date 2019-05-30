package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TextClick(View view) {
    }

    public void teamA_3point(View view) {
        scoreA+=3;
        display_TeamA(scoreA);
    }

    public void teamA_2point(View view) {
        scoreA+=2;
        display_TeamA(scoreA);
    }

    public void teamA_1point(View view) {
        scoreA+=1;
        display_TeamA(scoreA);
    }

    public void teamB_3point(View view) {
        scoreB+=3;
        display_TeamB(scoreB);
    }

    public void teamB_2point(View view) {
        scoreB+=2;
        display_TeamB(scoreB);
    }

    public void teamB_1point(View view) {
        scoreB+=1;
        display_TeamB(scoreB);
    }
    public void display_TeamA(int score){
        TextView scoreview = (TextView)findViewById(R.id.teamA_Score);
        scoreview.setText(String.valueOf(score));
    }
    public void display_TeamB(int score){
        TextView scoreview = (TextView)findViewById(R.id.teamB_Score);
        scoreview.setText(String.valueOf(score));
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        display_TeamA(scoreA);
        display_TeamB(scoreB);
    }
}
