package org.blackcat.Entity;

import java.util.List;

public class World {

    private AxisY axisY = new AxisY();
    public final SizeWorld sizeWorld;
    private int generation;

    private World(SizeWorld sizeWorld) {
        this.sizeWorld = sizeWorld;
    }

    public void populateAllCells() {
        for (int j = 0; j < sizeWorld.sizeY; j++) {
            for (int i = 0; i < sizeWorld.sizeX; i++) {
                addCellInCoordinate(new Coordinate(i, j));
            }
        }
    }

    public static World empty(SizeWorld sizeWorld) {
        return new World(sizeWorld);
    }

    public boolean isEmpty() {
        return axisY.countCells() < 1;
    }

    public void addCellInCoordinate(Coordinate coordinate) {
        axisY.addCellInCoordinate(coordinate);
    }

    public Cell getCellInCoordinate(Coordinate coordinate) {
        return axisY.getCellInCoordinate(coordinate);
    }

    public AxisY getAxisY() {
        return axisY;
    }

    public int countCells() {
        return axisY.countCells();
    }

    public List<Cell> getAllCells() {
        return axisY.getAllCells();
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int generation() {
        return generation;
    }
}
