package org.blackcat.Entity;
import java.util.Random;

public class Cell {
    private boolean itsAlive;
    private boolean stateNextGeneration;

    final Coordinate coordinate;

    public Cell(Coordinate coordinate) {
        this.coordinate = coordinate;

        randomizeInitialState();
    }

    private void randomizeInitialState() {
        Random ran = new Random();

        this.itsAlive = (1 == ran.nextInt(2));
    }

    public boolean itsAlive() {
        return itsAlive;
    }

    public void die() {
        itsAlive = false;
    }

    public void live() {
        itsAlive = true;
    }

    public int getX() {
        return coordinate.x;
    }

    public int getY() {
        return coordinate.y;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void dieNextGeneration() {
        stateNextGeneration = false;
    }

    public void liveNextGeneration() {
        stateNextGeneration = true;
    }
    public boolean itsAliveNextGeneration() {
        return stateNextGeneration;
    }

    public void changeGeneration() {
        itsAlive = stateNextGeneration;
    }

}
