import org.blackcat.Entity.Cell;
import org.blackcat.Entity.Coordinate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellTest {

    @Test
    public void a_cell_dead_lives_next_generation() {
        Cell cell = new Cell(new Coordinate(1, 1));
        cell.dead();
        cell.setStateNextGeneration(true);
        cell.changeGeneration();

        assertEquals(true, cell.getState());
    }

    @Test
    public void a_cell_live_dies_next_generation() {
        Cell cell = new Cell(new Coordinate(1, 1));
        cell.live();
        cell.setStateNextGeneration(false);
        cell.changeGeneration();

        assertEquals(false, cell.getState());
    }

}
