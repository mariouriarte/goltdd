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
            fillNullElementUpToIndex(index);
        }

        AxisX axisX = getAxisXInCoordinateY(index);
        axisX.addCell(cell);
        allCells.addCell(cell);
    }

    public void addCellInCoordinate(Coordinate coordinate) {

        int y = coordinate.y;

        fillNullElementUpToIndex(y);

        AxisX axisX = getAxisXInCoordinateY(y);

        Cell cell = new Cell(coordinate);

        axisX.addInCoordinateX(cell);
        allCells.addCell(cell);
    }

    private void fillNullElementUpToIndex(int index) {
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

        return ejeY.getCellInX(coordinate.x);
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

    public int countCells() {
        return allCells.getAxisX().size();
    }
}
