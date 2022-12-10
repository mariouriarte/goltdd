package org.blackcat;

import org.blackcat.Aplication.Game;
import org.blackcat.Entity.SizeWorld;

public class Main {
    public static void main(String[] args) {

        Game game = new Game(
                new SizeWorld(160, 80),
                1000000,
                30
        );
        game.play();
    }
}