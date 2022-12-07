package org.blackcat.Infrastructure;

import org.blackcat.Entity.AxisX;
import org.blackcat.Entity.AxisY;
import org.blackcat.Entity.Cell;

public class PrintWorld {

    private AxisY axisY;

    public PrintWorld(AxisY axisY) {
        this.axisY = axisY;
    }

    public void print() {

        for (AxisX axisX: axisY.getAxisY()) {
            for (Cell cell: axisX.getList()) {
                printState(cell);
            }
            System.out.println();
            System.out.println(" - ");
        }
    }

    private void printState(Cell cell) {
        String s = "o";
        if (!cell.itsAlive()) {
            s = " ";
        }
        System.out.print(s + " ");
    }
}
