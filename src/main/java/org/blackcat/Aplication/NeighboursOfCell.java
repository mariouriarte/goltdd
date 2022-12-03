package org.blackcat.Aplication;

import org.blackcat.Entity.Coordinate;
import org.blackcat.Entity.SizeWorld;

public class NeighboursOfCell {
    SizeWorld sizeWorld;
    Coordinate coordinate;

    public NeighboursOfCell(Coordinate coordinate, SizeWorld sizeWorld) {
        this.coordinate = coordinate;
        this.sizeWorld = sizeWorld;
    }

    public Coordinate neighbourTopLeft() {
        int x = coordinate.x;
        int y = coordinate.y;

        if (x == 0) {
            x = sizeWorld.sizeX;
        }

        if (y == 0) {
            y = sizeWorld.sizeY;
        }

        return new Coordinate(x -1, y -1);
    }

    public Coordinate neighbourTop() {
        int y = coordinate.y;

        if (y == 0) {
            y = sizeWorld.sizeY;
        }

        return new Coordinate(coordinate.x, y - 1);
    }

    public Coordinate neighbourTopRight() {
        int x = coordinate.x;
        int y = coordinate.y;

        if (x == (sizeWorld.sizeX - 1)) {
            x = -1;
        }

        if (y == 0) {
            y = sizeWorld.sizeY;
        }

        return new Coordinate(x + 1, y -1);
    }

    public Coordinate neighbourRight() {
        int x = coordinate.x;
        int y = coordinate.y;

        if (x == (sizeWorld.sizeX - 1)) {
            x = -1;
        }

        return new Coordinate(x + 1, y);
    }

    public Coordinate neighbourBottomRight() {
        int x = coordinate.x;
        int y = coordinate.y;

        if (x == (sizeWorld.sizeX - 1)) {
            x = -1;
        }

        if (y == (sizeWorld.sizeY - 1)) {
            y = -1;
        }

        return new Coordinate(x + 1,  y + 1);
    }

    public Coordinate neighbourBottom() {
        int x = coordinate.x;
        int y = coordinate.y;

        if (y == (sizeWorld.sizeY - 1)) {
            y = -1;
        }

        return new Coordinate(x, y + 1);
    }

    public Coordinate neighbourBottomLeft() {
        int x = coordinate.x;
        int y = coordinate.y;

        if (x == 0) {
            x = sizeWorld.sizeX;
        }

        if (y == (sizeWorld.sizeY - 1)) {
            y = -1;
        }

        return new Coordinate(x - 1, y + 1);
    }

    public Coordinate neighbourLeft() {
        int x = coordinate.x;
        int y = coordinate.y;

        if (x == 0) {
            x = sizeWorld.sizeX;
        }

        return new Coordinate(x - 1, y);
    }
}
