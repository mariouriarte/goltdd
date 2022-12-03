package org.blackcat.Aplication;

import org.blackcat.Entity.Cell;
import org.blackcat.Entity.Coordinate;
import org.blackcat.Entity.Plane;

public class NeighboursOfCell {
    Cell cell;

    public NeighboursOfCell(Cell cell, Plane plane) {
        this.cell = cell;
    }


    public Coordinate neighbourTopLeft() {
        int neighbourX = cell.getX() - 1;
        int neighbourY = cell.getY() - 1;

        return new Coordinate(neighbourX, neighbourY);
    }

    public Coordinate neighbourTop() {
        int neighbourX = cell.getX();
        int neighbourY = cell.getY() - 1;

        return new Coordinate(neighbourX, neighbourY);
    }

    public Coordinate neighbourTopRight() {
        int neighbourX = cell.getX() + 1;
        int neighbourY = cell.getY() - 1;

        return new Coordinate(neighbourX, neighbourY);
    }

    public Coordinate neighbourRight() {
        int neighbourX = cell.getX() + 1;
        int neighbourY = cell.getY();

        return new Coordinate(neighbourX, neighbourY);
    }

    public Coordinate neighbourBottomRight() {
        int neighbourX = cell.getX() + 1;
        int neighbourY = cell.getY() + 1;

        return new Coordinate(neighbourX, neighbourY);
    }

    public Coordinate neighbourBottom() {
        int neighbourX = cell.getX();
        int neighbourY = cell.getY() + 1;

        return new Coordinate(neighbourX, neighbourY);
    }

    public Coordinate neighbourBottomLeft() {
        int neighbourX = cell.getX() - 1;
        int neighbourY = cell.getY() + 1;

        return new Coordinate(neighbourX, neighbourY);
    }

    public Coordinate neighbourLeft() {
        int neighbourX = cell.getX() - 1;
        int neighbourY = cell.getY();

        return new Coordinate(neighbourX, neighbourY);
    }
}
