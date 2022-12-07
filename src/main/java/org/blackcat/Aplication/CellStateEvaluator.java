package org.blackcat.Aplication;

import org.blackcat.Entity.Cell;
import org.blackcat.Entity.World;

public class CellStateEvaluator {

    private CellStateEvaluator() {}

    public static void evaluate(Cell cell, World world) {
        NeighboursOfCell neighbours = new NeighboursOfCell(world);
        neighbours.setCoordinate(cell.getCoordinate());

        if (cell.itsAlive() == true) {
            if (neighbours.numberOfLives() == 2 || neighbours.numberOfLives() == 3) {
                cell.liveNextGeneration();
            } else if (neighbours.numberOfLives() < 2) {
                cell.dieNextGeneration();
            } else if (neighbours.numberOfLives() > 3) {
                cell.dieNextGeneration();
            }
        } else {
            if (neighbours.numberOfLives() == 3) {
                cell.liveNextGeneration();
            }
        }
    }
}
