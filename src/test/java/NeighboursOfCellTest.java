import org.blackcat.Aplication.NeighboursOfCell;
import org.blackcat.Entity.Cell;
import org.blackcat.Entity.Coordinate;
import org.blackcat.Entity.Plane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NeighboursOfCellTest {

    NeighboursOfCell neighbours;

    public NeighboursOfCellTest() {
        prepareNeighbours();
    }

    private void prepareNeighbours() {
        Plane plane = new Plane(4, 4);
        Cell cell = new Cell(new Coordinate(1, 1));

        neighbours = new NeighboursOfCell(cell, plane);
    }

    @Test
    public void cell_has_neighbour_top_left() {
        Coordinate coordinateNeighbour = neighbours.neighbourTopLeft();

        assertEquals(coordinateNeighbour.x, 0);
        assertEquals(coordinateNeighbour.y, 0);
    }

    @Test
    public void cell_has_neighbour_top() {
        Coordinate coordinateNeighbour = neighbours.neighbourTop();

        assertEquals(coordinateNeighbour.x, 1);
        assertEquals(coordinateNeighbour.y, 0);
    }

    @Test
    public void cell_has_neighbour_top_right() {
        Coordinate coordinateNeighbour = neighbours.neighbourTopRight();

        assertEquals(coordinateNeighbour.x, 2);
        assertEquals(coordinateNeighbour.y, 0);
    }

    @Test
    public void cell_has_neighbour_right() {
        Coordinate coordinateNeighbour = neighbours.neighbourRight();

        assertEquals(coordinateNeighbour.x, 2);
        assertEquals(coordinateNeighbour.y, 1);
    }

    @Test
    public void cell_has_neighbour_bottom_right() {
        Coordinate coordinateNeighbour = neighbours.neighbourBottomRight();

        assertEquals(coordinateNeighbour.x, 2);
        assertEquals(coordinateNeighbour.y, 2);
    }

    @Test
    public void cell_has_neighbour_bottom() {
        Coordinate coordinateNeighbour = neighbours.neighbourBottom();

        assertEquals(coordinateNeighbour.x, 1);
        assertEquals(coordinateNeighbour.y, 2);
    }

    @Test
    public void cell_has_neighbour_bottom_left() {
        Coordinate coordinateNeighbour = neighbours.neighbourBottomLeft();

        assertEquals(coordinateNeighbour.x, 0);
        assertEquals(coordinateNeighbour.y, 2);
    }

    @Test
    public void cell_has_neighbour_left() {
        Coordinate coordinateNeighbour = neighbours.neighbourLeft();

        assertEquals(coordinateNeighbour.x, 0);
        assertEquals(coordinateNeighbour.y, 1);
    }
}
