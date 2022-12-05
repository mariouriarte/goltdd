package org.blackcat.Entity;

import org.blackcat.Aplication.Exception.CoordinateOutBoundException;

public class Coordinate {
    final public int x;
    final public int y;

    public Coordinate(int x, int y) {

        if (x < 0 || y < 0) {
            throw new CoordinateOutBoundException();
        }

        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println("["+x+", "+y+"]");
    }

}
