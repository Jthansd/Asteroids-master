package org.psnbtech;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    @Test
    public void TestScore(){
        Game game = new Game();
        assertEquals(0, game.getScore());
        System.out.println("Score reset");
        System.out.println("Adding 100 score");
        game.addScore(100);
        assertEquals(100, game.getScore());
        System.out.println("Added Score Correctly");
    }
}
