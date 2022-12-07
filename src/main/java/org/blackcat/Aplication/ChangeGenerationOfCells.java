package org.blackcat.Aplication;

import org.blackcat.Entity.Cell;
import org.blackcat.Entity.World;

import java.util.List;

public class ChangeGenerationOfCells {

    public static void evolve(World world) {

        List<Cell> listCells = world.getAllCells();

        for (Cell cell: listCells) {
            cell.changeGeneration();
        }
    }
}
