package org.blackcat.Aplication;

import org.blackcat.Entity.Cell;
import org.blackcat.Entity.Coordinate;
import org.blackcat.Entity.World;

import java.util.ArrayList;
import java.util.List;

public class NeighboursOfCell {
    private final World world;
    private Coordinate coordinate;

    public NeighboursOfCell(World world) {
        this.world = world;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public List<Cell> getNeighbours() {
        CoordinatesOfNeighbours coordinates = new CoordinatesOfNeighbours(coordinate, world.sizeWorld);
        List<Coordinate> coordinateList = coordinates.getAll();

        List<Cell> neighbours = new ArrayList<>();

        for (Coordinate item : coordinateList) {
            neighbours.add(world.getCellInCoordinate(item));
        }

        return neighbours;
    }

    public int numberOfLives() {
        List<Cell> neighbours = getNeighbours();

        int numLives = 0;

        for (Cell cell : neighbours) {
            if (cell.itsAlive()) {
                numLives++;
            }
        }

        return numLives;
    }

    public int numberOfDied() {
        List<Cell> neighbours = getNeighbours();

        int numberOfDied = 0;

        for (Cell cell : neighbours) {
            if (!cell.itsAlive()) {
                numberOfDied++;
            }
        }

        return numberOfDied;
    }
}
