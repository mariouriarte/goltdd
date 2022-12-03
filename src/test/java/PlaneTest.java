import org.blackcat.Entity.Cell;
import org.blackcat.Entity.Coordinate;
import org.blackcat.Entity.Plane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlaneTest {

    @Test
    public void test_a_new_plane_is_empty() {
        Plane plane = Plane.planeEmpty(4, 4);
        assertTrue(plane.isEmpty());
    }

    @Test
    public void test_a_cell_can_be_added_to_the_plane() {
        Coordinate coordinate = new Coordinate(1, 2);
        Plane plane = Plane.planeEmpty(4, 4);
        plane.addCellInCoordinate(coordinate);

        Cell cell = plane.getCellInCoordinate(coordinate);

        assertTrue(cell.getCoordinate().y == 2);
        assertTrue(cell.getCoordinate().x == 1);
    }

    @Test
    public void test_two_cells_can_be_added_to_the_plane() {
        Coordinate coordinate = new Coordinate(7, 1);
        Coordinate coordinate1 = new Coordinate(0, 1);

        Plane plane = Plane.planeEmpty(4, 4);

        plane.addCellInCoordinate(coordinate);
        plane.addCellInCoordinate(coordinate1);

        Cell cell = plane.getCellInCoordinate(coordinate);
        Cell cell2 = plane.getCellInCoordinate(coordinate1);

        assertTrue(cell.getCoordinate().x == 7);
        assertTrue(cell.getCoordinate().y == 1);

        assertTrue(cell2.getCoordinate().x == 0);
        assertTrue(cell2.getCoordinate().y == 1);
    }
}
