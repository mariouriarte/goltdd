package org.blackcat.Entity;

import org.blackcat.Aplication.Exception.CoordinateOutBoundException;

import java.util.ArrayList;
import java.util.List;

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

    public void calculateNeighbours() {
        List<Coordinate> neighbours = new ArrayList<>();
    }

    public void print() {
        System.out.println("["+x+", "+y+"]");
    }

//    public Coordinate neighbourTopLeft() {
//
//        if (y == 0) {
//
//        }
//
//        int neighbourX = x - 1;
//        int neighbourY = y - 1;
//
//        return new Coordinate(neighbourX, neighbourY);
//    }
}
