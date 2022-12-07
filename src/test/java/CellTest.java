import org.blackcat.Entity.Cell;
import org.blackcat.Entity.Coordinate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellTest {

    @Test
    public void a_cell_dies() {
        Cell cell = new Cell(new Coordinate(1, 1));
        cell.die();
        assertFalse(cell.itsAlive());
    }

    @Test
    public void a_cell_live() {
        Cell cell = new Cell(new Coordinate(1, 1));
        cell.live();
        assertTrue(cell.itsAlive());
    }

    @Test
    public void a_cell_dead_lives_next_generation() {
        Cell cell = new Cell(new Coordinate(1, 1));
        cell.die();
        cell.liveNextGeneration();
        cell.changeGeneration();

        assertTrue(cell.itsAlive());
    }

    @Test
    public void a_cell_live_dies_next_generation() {
        Cell cell = new Cell(new Coordinate(1, 1));
        cell.live();
        cell.dieNextGeneration();
        cell.changeGeneration();

        assertFalse(cell.itsAlive());
    }
}
