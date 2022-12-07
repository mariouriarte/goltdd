package org.blackcat;

import org.blackcat.Aplication.Game;
import org.blackcat.Entity.SizeWorld;

public class Main {
    public static void main(String[] args) {

        Game game = new Game(
                new SizeWorld(20, 10),
                100000,
                3000
        );
        game.play();
    }
}