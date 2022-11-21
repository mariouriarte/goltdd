package org.blackcat.Entity;

import org.blackcat.Aplication.Exception.NotSuchCellException;

import java.util.ArrayList;
import java.util.List;

public class AxisX {
    private List<Cell> axisX = new ArrayList();

    public List<Cell> getAxisX() {
        return axisX;
    }

    public void addCell(Cell cell) {
        axisX.add(cell);
    }

    public void addInCoordinateX(Cell cell) {
        int index = cell.coordinate.x;

        try {
            Cell oldCell = axisX.get(index);

            if (oldCell == null) {
                axisX.set(index, cell);
            }
        } catch (IndexOutOfBoundsException e) {
            fillNullElementUntilIndex(index);
            axisX.add(index, cell);
        }
    }

    private void fillNullElementUntilIndex(int index) {
        for (int i = 0; i < index; i++) {
            try {
                axisX.get(i);
            } catch (IndexOutOfBoundsException e) {
                axisX.add(null);
            }
        }
    }

    private boolean isValidIndex(int index) {
        return index >= 0 && index < axisX.size();
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
