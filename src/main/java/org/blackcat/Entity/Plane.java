package org.blackcat.Entity;

public class Plane {

    private AxisY axisY = new AxisY();
    private int sidesNumberX, sidesNumberY;

    public void setSides(int x, int y) {
        this.sidesNumberX = sidesNumberX;
        this.sidesNumberY = sidesNumberY;

//        initialize();
    }

//    private void initialize() {
//        for (int j = 0; j < axisY.numberOfSides(); j++) {
//            for (int i = 0; i < sidesNumberX; i++) {
//                Cell cell = new Cell(new Coordinate(i, j));
//                axisY.addCellInCoordinateY(j, cell);
//            }
//        }
//    }

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
