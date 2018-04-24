package com.android.ryan.rockpaperscissors;

import java.util.Random;

public class RPSGame {

    String playerHand;
    String computerHand;

    public RPSGame() {
        this.playerHand = playerHand;
        this.computerHand = computerHand;
    }

    public String generateComputerHand(){
        String [] arrayOfHands = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        int selectHand = random.nextInt(arrayOfHands.length);
        return arrayOfHands[selectHand];
    }


    public String play(String playerHand, String computerHand){
        if (playerHand == computerHand){
            return "It's a draw!";
        }
        else if (playerHand == "Scissors" && computerHand == "Paper") {
            return "You win with Scissors and cut through the computer's paper!";
        }
        else if (playerHand == "Scissors" && computerHand == "Rock") {
            return "You lose, computer blunted your feeble scissors with a rock!";
        }
        else if (playerHand == "Rock" && computerHand == "Paper") {
            return "You lose, computer wraps up your rock in paper and gives it back to you for Christmas";
        }
        else if (playerHand == "Rock" && computerHand == "Scissors") {
            return "You win, mangled the computer's scissors with your rock!";
        }
        else if (playerHand == "Paper" && computerHand == "Rock"){
            return "You win by wrapping the computer's rock up in paper!";
        }
        else{
            return "You lose, the computer's scissors of steel slice through your paltry paper";
        }
    }












}
