package com.android.ryan.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RPSGame game;
    private TextView resultTextViewID;
    private TextView scoreTextViewID;
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
        scoreTextViewID = findViewById(R.id.scoreTextViewID);
        game = new RPSGame();
    }


    public void onRockButtonPressed(View button){
        String playerHand = "Rock";
        play(playerHand);
        scoreTextViewID.setText("Score: You - " + game.playerScore + ", CPU - " + game.computerScore);
    }

    public void onPaperButtonPressed(View button){
        String playerHand = "Paper";
        play(playerHand);
        scoreTextViewID.setText("Score: You - " + game.playerScore + ", CPU - " + game.computerScore);
    }

    public void onScissorsButtonPressed(View button){
        String playerHand = "Scissors";
        play(playerHand);
        scoreTextViewID.setText("Score: You - " + game.playerScore + ", CPU - " + game.computerScore);
    }

    public void play(String plyrhnd){
        String computerHand = game.generateComputerHand();
        resultTextViewID.setText(game.play(plyrhnd, computerHand));
        scoreTextViewID.setText("Score: You - " + game.playerScore + ", CPU - " + game.computerScore);
    }










}
