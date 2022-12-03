package org.blackcat.Entity;

public class World {

    private AxisY axisY = new AxisY();
    final SizeWorld sizeWorld;

    public World(SizeWorld sizeWorld) {
        this.sizeWorld = sizeWorld;
    }

    //    private void initialize() {
//        for (int j = 0; j < axisY.numberOfSides(); j++) {
//            for (int i = 0; i < sidesNumberX; i++) {
//                Cell cell = new Cell(new Coordinate(i, j));
//                axisY.addCellInCoordinateY(j, cell);
//            }
//        }
//    }

    public static World planeEmpty(int x, int y) {
        return new World(new SizeWorld(4, 4));
    }

    public boolean isEmpty() {
        return axisY.numberOfCells() < 1;
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
