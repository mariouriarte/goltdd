package org.blackcat.Infrastructure;

import org.blackcat.Entity.AxisX;
import org.blackcat.Entity.AxisY;
import org.blackcat.Entity.Cell;
import org.blackcat.Entity.World;

public class PrintWorld {

    private AxisY axisY;
    private World world;

    public PrintWorld(World world) {
        this.axisY = world.getAxisY();
        this.world = world;
    }

    public void print() {
        System.out.println("Game of life, Conways");

        for (AxisX axisX: axisY.getAxisY()) {
            for (Cell cell: axisX.getList()) {
                printState(cell);
            }
            System.out.println();
        }
        System.out.println("> generation " + world.generation());
    }

    private void printState(Cell cell) {
        String s = "o";
        if (!cell.itsAlive()) {
            s = " ";
        }
        System.out.print(s + " ");
    }
}
