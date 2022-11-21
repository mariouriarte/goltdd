package org.blackcat.Entity;

import org.blackcat.Aplication.Exception.NotSuchAxisYException;

import java.util.ArrayList;
import java.util.List;

public class AxisY {
    private List<AxisX> axisY = new ArrayList();
    AxisX allCells = new AxisX();

    public void addSide(int index) {
        axisY.add(index, new AxisX());
    }

    public void addSide() {
        axisY.add(new AxisX());
    }

    public void addCellInCoordinateY(int index, Cell cell) {

        if (axisY.size() != (index + 1)) {
            fillNullElementUntilIndex(index);
        }

        AxisX axisX = getAxisXInCoordinateY(index);
        axisX.addCell(cell);
        allCells.addCell(cell);
    }

    public void addCellInCoordinate(Coordinate coordinate) {

        int index = coordinate.y;

        fillNullElementUntilIndex(index);

        AxisX axisX = getAxisXInCoordinateY(coordinate.y);

        Cell cell = new Cell(coordinate);

        axisX.addInCoordinateX(cell);
        allCells.addCell(cell);
    }

    private void fillNullElementUntilIndex(int index) {
        if (axisY.size() == (index + 1)) {
            return;
        }

        for (int i = 0; i <= index; i++) {
            try {
                axisY.get(i);
            } catch (IndexOutOfBoundsException e) {
                addSide(i);
            }
        }
    }

    public Cell getCellInCoordinate(Coordinate coordinate) {
        AxisX ejeY = getAxisXInCoordinateY(coordinate.y);

        Cell cell = ejeY.getCellInX(coordinate.x);

        return cell;
    }

    public AxisX getAxisXInCoordinateY(int index) {

        try {
            return axisY.get(index);
        } catch (IndexOutOfBoundsException e) {
            throw new NotSuchAxisYException();
        }
    }

    public List<AxisX> getAxisY() {
        return axisY;
    }

    public AxisX getAllCells() {
        return allCells;
    }

    public int numberOfCells() {
        return allCells.getAxisX().size();
    }

    public int numberOfSides() {
        if (axisY.size() == 0) {
            return 0;
        }

        return axisY.size();
    }
}
