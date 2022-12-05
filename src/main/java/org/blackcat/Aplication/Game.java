package org.blackcat.Aplication;

import org.blackcat.Aplication.Exception.NotSuchCellException;
import org.blackcat.Entity.SizeWorld;
import org.blackcat.Entity.World;

import static java.lang.Thread.sleep;

public class Game {
    private final int numGenerations;
    private final int timeSleep;

    World world;

    public Game(SizeWorld sizeWorld, int numGenerations, int timeSleep) {
        this.numGenerations = numGenerations;
        this.timeSleep = timeSleep;

        prepareEmptyWorld(sizeWorld);
    }

    private void prepareEmptyWorld(SizeWorld sizeWorld) {
        world = World.empty(sizeWorld);
        world.populateAllCells();
    }

    public void play() {

        for (int i = 0; i < numGenerations; i++) {

            try {
                sleep(timeSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                iterateGenerators();
            } catch (NotSuchCellException ignored) {
            }

            //UnverifiedAllCells.unverified(plane);
            //ChangeGenerationCells.evolve(plane);
        }
    }

    private void iterateGenerators() {

    }

    private void print() {

    }
}
