import org.blackcat.Entity.Cell;
import org.blackcat.Entity.Coordinate;
import org.blackcat.Entity.SizeWorld;
import org.blackcat.Entity.World;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WorldTest {

    @Test
    public void a_new_plane_is_empty() {
        World world = World.empty(new SizeWorld(4, 4));
        assertTrue(world.isEmpty());
    }

    @Test
    public void a_cell_can_be_added_to_the_plane() {
        Coordinate coordinate = new Coordinate(1, 2);
        World world = World.empty(new SizeWorld(4, 4));
        world.addCellInCoordinate(coordinate);

        Cell cell = world.getCellInCoordinate(coordinate);

        assertEquals(2, cell.getCoordinate().y);
        assertEquals(1, cell.getCoordinate().x);
    }

    @Test
    public void two_cells_can_be_added_to_the_plane() {
        Coordinate coordinate = new Coordinate(7, 1);
        Coordinate coordinate2 = new Coordinate(0, 1);

        World world = World.empty(new SizeWorld(4, 4));

        world.addCellInCoordinate(coordinate);
        world.addCellInCoordinate(coordinate2);

        Cell cell = world.getCellInCoordinate(coordinate);
        Cell cell2 = world.getCellInCoordinate(coordinate2);

        assertEquals(7, cell.getX());
        assertEquals(1, cell.getY());

        assertEquals(0, cell2.getX());
        assertEquals(1, cell2.getY());
    }

    @Test
    public void populate_world_empty_whit_cells() {
        SizeWorld sizeWorld = new SizeWorld(4, 5);
        int totalExpected = sizeWorld.sizeX * sizeWorld.sizeY;

        World world = World.empty(sizeWorld);
        world.populateAllCells();

        assertEquals(totalExpected, world.countCells());
    }
}
