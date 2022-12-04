package org.blackcat.Entity;

import org.blackcat.Aplication.Exception.NotSuchCellException;

import java.util.ArrayList;
import java.util.List;

public class AxisX {
    private List<Cell> axisX = new ArrayList<>();

    public List<Cell> getAxisX() {
        return axisX;
    }

    public void addCell(Cell cell) {
        axisX.add(cell);
    }

    public void addInCoordinateX(Cell cell) {
        int x = cell.coordinate.x;

        try {
            axisX.get(x);
            axisX.set(x, cell);
        } catch (IndexOutOfBoundsException e) {
            fillNullElementUpToIndex(x);
            axisX.add(x, cell);
        }
    }

    private void fillNullElementUpToIndex(int index) {
        for (int i = 0; i < index; i++) {
            try {
                axisX.get(i);
            } catch (IndexOutOfBoundsException e) {
                axisX.add(null);
            }
        }
    }

    public Cell getCellInX(int index){
        try {
            return axisX.get(index);
        } catch (IndexOutOfBoundsException e) {
            throw new NotSuchCellException();
        }
    }

    public List<Cell> getAxis() {
        return axisX;
    }
}
