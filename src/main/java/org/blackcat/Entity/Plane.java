package org.blackcat.Entity;

public class Plane {

    private AxisY axisY = new AxisY();
    private int sidesOfX, sidesOfY;

    public Plane(int sidesOfX, int sidesOfY) {
        this.sidesOfX = sidesOfX;
        this.sidesOfY = sidesOfY;
    }

    //    private void initialize() {
//        for (int j = 0; j < axisY.numberOfSides(); j++) {
//            for (int i = 0; i < sidesNumberX; i++) {
//                Cell cell = new Cell(new Coordinate(i, j));
//                axisY.addCellInCoordinateY(j, cell);
//            }
//        }
//    }

    public static Plane planeEmpty(int x, int y) {
        return new Plane(x, y);
    }

    public boolean isEmpty() {
        if (axisY.numberOfCells() > 0) {
            return false;
        }
        return true;
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
}
