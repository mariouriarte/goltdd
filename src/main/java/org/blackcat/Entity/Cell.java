package org.blackcat.Entity;
import java.util.Random;

public class Cell {
    private boolean state;
    private boolean stateNextGeneration;
    private boolean verified = false;

    final Coordinate coordinate;

    public Cell(Coordinate coordinate) {
        this.coordinate = coordinate;

        randomizeState();
    }

    private void randomizeState() {
        Random ran = new Random();

        if (1 == ran.nextInt(2)) {
            this.state = true;
        } else {
            this.state = false;
        }
    }

    public boolean getState() {
        return state;
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

    public void dead() {
        stateNextGeneration = false;
    }

    public void live() {
        stateNextGeneration = true;
    }

    public void setVerified(boolean val) {
        verified = val;
    }

    public boolean getVerified() {
        return verified;
    }

    public void setStateNextGeneration(boolean state) {
        this.stateNextGeneration = state;
    }

    public void changeGeneration() {
        state = stateNextGeneration;
    }
}
