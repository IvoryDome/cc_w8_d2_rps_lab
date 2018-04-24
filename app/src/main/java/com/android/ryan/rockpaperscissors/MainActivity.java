package com.android.ryan.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RPSGame game;
    private TextView resultTextViewID;
    private Button rockButtonID;
    private Button paperButtonID;
    private Button scissorsButtonID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTextViewID = findViewById(R.id.resultTextViewID);
        rockButtonID = findViewById(R.id.rockButtonID);
        paperButtonID = findViewById(R.id.paperButtonID);
        scissorsButtonID = findViewById(R.id.scissorsButtonID);
    }


    public void onRockButtonPressed(View button){
        game = new RPSGame();
        String playerHand = "Rock";
        String computerHand = game.generateComputerHand();
        resultTextViewID.setText(game.play(playerHand, computerHand));
    }

    public void onPaperButtonPressed(View button){
        game = new RPSGame();
        String playerHand = "Paper";
        String computerHand = game.generateComputerHand();
        resultTextViewID.setText(game.play(playerHand, computerHand));
    }

    public void onScissorsButtonPressed(View button){
        game = new RPSGame();
        String playerHand = "Scissors";
        String computerHand = game.generateComputerHand();
        resultTextViewID.setText(game.play(playerHand, computerHand));
    }










}
