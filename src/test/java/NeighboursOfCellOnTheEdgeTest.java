import org.blackcat.Aplication.NeighboursOfCell;
import org.blackcat.Entity.Cell;
import org.blackcat.Entity.Coordinate;
import org.blackcat.Entity.Plane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NeighboursOfCellOnTheEdgeTest {

    NeighboursOfCell neighbours;

    public NeighboursOfCellOnTheEdgeTest() {
        Plane plane = new Plane(4, 4);
        Cell cell = new Cell(new Coordinate(1, 1));

        neighbours = new NeighboursOfCell(cell, plane);
    }

    @Test
    public void coordinate_has_neighbours_top_left() {

        Coordinate coordinateNeighbour = neighbours.neighbourTopLeft();

        assertEquals(coordinateNeighbour.x, 0);
        assertEquals(coordinateNeighbour.y, 0);
    }

    @Test
    public void coordinate_has_neighbours_edge_top_left() {

        Coordinate coordinateNeighbour = neighbours.neighbourTopLeft();

        assertEquals(coordinateNeighbour.x, 0);
        assertEquals(coordinateNeighbour.y, 0);
    }
}
