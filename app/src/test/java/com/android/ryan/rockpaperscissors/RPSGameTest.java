package com.android.ryan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class RPSGameTest {

    RPSGame game;

    @Before
    public void before() {
        game = new RPSGame();
    }


    @Test
    public void doesGameWork(){
        assertEquals("You win with Scissors!", game.play("Scissors", "Paper"));
    }
}
