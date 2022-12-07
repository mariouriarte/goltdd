package org.blackcat;

import org.blackcat.Aplication.Game;
import org.blackcat.Entity.SizeWorld;

public class Main {
    public static void main(String[] args) {

        Game game = new Game(
                new SizeWorld(4, 4),
                1000,
                300
        );
        game.play();
    }
}