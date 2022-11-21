package org.blackcat.Entity;
import java.util.Random;

public class Cell {
    private int state;
    private int stateNextGeneration;
    private boolean verified = false;

    final Coordinate coordinate;

    public Cell(Coordinate coordinate) {
        this.coordinate = coordinate;

        Random ran = new Random();
        this.state = ran.nextInt(2);
    }

    public int getState() {
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

    public void kill() {
        stateNextGeneration = 0;
    }

    public void aliveAgain() {
        stateNextGeneration = 1;
    }

    public void setVerified(boolean val) {
        verified = val;
    }

    public boolean getVerified() {
        return verified;
    }

    public void setStateNextGeneration(int stateNextGeneration) {
        this.stateNextGeneration = stateNextGeneration;
    }

    public void changeGeneration() {
        state = stateNextGeneration;
    }
}
