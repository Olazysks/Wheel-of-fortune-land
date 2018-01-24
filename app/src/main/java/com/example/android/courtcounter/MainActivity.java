package com.example.android.courtcounter;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;
    int scorePlayer3 = 0;
    int prizeNoPlayer1 = 0;
    int prizeNoPlayer2 = 0;
    int prizeNoPlayer3 = 0;
    TextView player_1_score;
    TextView player_2_score;
    TextView player_3_score;
    TextView player_1_NoOfPrizes;
    TextView player_2_NoOfPrizes;
    TextView player_3_NoOfPrizes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player_1_score = findViewById(R.id.player_1_score);
        player_2_score = findViewById(R.id.player_2_score);
        player_3_score = findViewById(R.id.player_3_score);
        player_1_NoOfPrizes = findViewById(R.id.player_1_NoOfPrizes);
        player_2_NoOfPrizes = findViewById(R.id.player_2_NoOfPrizes);
        player_3_NoOfPrizes = findViewById(R.id.player_3_NoOfPrizes);

        if (savedInstanceState != null) {
            scorePlayer1 = savedInstanceState.getInt("scorePlayer1");
            displayForPlayer1(scorePlayer1);
            scorePlayer2 = savedInstanceState.getInt("scorePlayer2");
            displayForPlayer2(scorePlayer2);
            scorePlayer3 = savedInstanceState.getInt("scorePlayer3");
            displayForPlayer3(scorePlayer3);
            prizeNoPlayer1 = savedInstanceState.getInt("prizeNoPlayer1");
            displayNoOfPrizesForPlayer1(prizeNoPlayer1);
            prizeNoPlayer2 = savedInstanceState.getInt("prizeNoPlayer2");
            displayNoOfPrizesForPlayer2(prizeNoPlayer2);
            prizeNoPlayer3 = savedInstanceState.getInt("prizeNoPlayer3");
            displayNoOfPrizesForPlayer3(prizeNoPlayer3);
        }
    }

    /*
     * Action taken on save and possible to be read out from Bundle after changing orientation or language etc.
     * Reading out is done in onCreate method.
     */

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scorePlayer1", scorePlayer1);
        outState.putInt("scorePlayer2", scorePlayer2);
        outState.putInt("scorePlayer3", scorePlayer3);
        outState.putInt("prizeNoPlayer1", prizeNoPlayer1);
        outState.putInt("prizeNoPlayer2", prizeNoPlayer2);
        outState.putInt("prizeNoPlayer3", prizeNoPlayer3);
    }

    /**
     * Increase the score for Player 1 by 1500 point.
     */
    public void add1500ForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 1500;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase the score for Player 1 by 250 points.
     */
    public void add250ForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 250;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase the score for Player 1 by 100 points.
     */
    public void add100ForPlayer1(View v) {
        scorePlayer1 = scorePlayer1 + 100;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Resets score for Player 1.
     */
    public void BANKRUTForPlayer1(View v) {
        scorePlayer1 = 0;
        displayForPlayer1(scorePlayer1);
    }

    /**
     * Increase the number of gathered prizes for Player 1 by 1.
     */
    public void addPrizeForPlayer1(View v) {
        prizeNoPlayer1 = prizeNoPlayer1 + 1;
        displayNoOfPrizesForPlayer1(prizeNoPlayer1);
    }

    /**
     * Displays the given score for Player 1.
     */
    public void displayForPlayer1(int score) {
        player_1_score.setText(String.valueOf(score));
    }

    /**
     * Displays the given number of gathered prizes for Player 1.
     */
    public void displayNoOfPrizesForPlayer1(int score) {
        player_1_NoOfPrizes.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Player 2 by 1500 point.
     */
    public void add1500ForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 1500;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase the score for Player 2 by 250 points.
     */
    public void add250ForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 250;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase the score for Player 2 by 100 points.
     */
    public void add100ForPlayer2(View v) {
        scorePlayer2 = scorePlayer2 + 100;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Resets score for Player 2.
     */
    public void BANKRUTForPlayer2(View v) {
        scorePlayer2 = 0;
        displayForPlayer2(scorePlayer2);
    }

    /**
     * Increase the number of gathered prizes for Player 2 by 1.
     */
    public void addPrizeForPlayer2(View v) {
        prizeNoPlayer2 = prizeNoPlayer2 + 1;
        displayNoOfPrizesForPlayer2(prizeNoPlayer2);
    }

    /**
     * Displays the given score for Player 2.
     */
    public void displayForPlayer2(int score) {
        player_2_score.setText(String.valueOf(score));
    }

    /**
     * Displays the given number of gathered prizes for Player 2.
     */
    public void displayNoOfPrizesForPlayer2(int score) {
        player_2_NoOfPrizes.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Player 3 by 1500 point.
     */
    public void add1500ForPlayer3(View v) {
        scorePlayer3 = scorePlayer3 + 1500;
        displayForPlayer3(scorePlayer3);
    }

    /**
     * Increase the score for Player 3 by 250 points.
     */
    public void add250ForPlayer3(View v) {
        scorePlayer3 = scorePlayer3 + 250;
        displayForPlayer3(scorePlayer3);
    }

    /**
     * Increase the score for Player 3 by 100 points.
     */
    public void add100ForPlayer3(View v) {
        scorePlayer3 = scorePlayer3 + 100;
        displayForPlayer3(scorePlayer3);
    }

    /**
     * Resets score for Player 3.
     */
    public void BANKRUTForPlayer3(View v) {
        scorePlayer3 = 0;
        displayForPlayer3(scorePlayer3);
    }

    /**
     * Increase the number of gathered prizes for Player 3 by 1.
     */
    public void addPrizeForPlayer3(View v) {
        prizeNoPlayer3 = prizeNoPlayer3 + 1;
        displayNoOfPrizesForPlayer3(prizeNoPlayer3);
    }

    /**
     * Displays the given score for Player 3.
     */
    public void displayForPlayer3(int score) {
        player_3_score.setText(String.valueOf(score));
    }

    /**
     * Displays the given number of gathered prizes for Player 3.
     */
    public void displayNoOfPrizesForPlayer3(int score) {
        player_3_NoOfPrizes.setText(String.valueOf(score));
    }

    /**
     * Reset all scores and prizes.
     */
    public void reset(View v) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        scorePlayer3 = 0;
        prizeNoPlayer1 = 0;
        prizeNoPlayer2 = 0;
        prizeNoPlayer3 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
        displayForPlayer3(scorePlayer3);
        displayNoOfPrizesForPlayer1(prizeNoPlayer1);
        displayNoOfPrizesForPlayer2(prizeNoPlayer2);
        displayNoOfPrizesForPlayer3(prizeNoPlayer3);
    }
}
