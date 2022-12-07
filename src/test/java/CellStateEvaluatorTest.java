import org.blackcat.Aplication.CellStateEvaluator;
import org.blackcat.Aplication.CoordinatesOfNeighbours;
import org.blackcat.Entity.Cell;
import org.blackcat.Entity.Coordinate;
import org.blackcat.Entity.SizeWorld;
import org.blackcat.Entity.World;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellStateEvaluatorTest {
    private Coordinate coordinate;
    private SizeWorld sizeWorld;
    private World world;
    private Cell cell;
    private CoordinatesOfNeighbours neighboursCoordinates;

    public CellStateEvaluatorTest() {
        coordinate = new Coordinate(1, 1);
        sizeWorld = new SizeWorld(4 , 4);
        world = World.empty(sizeWorld);
        world.populateAllCells();
        cell = world.getCellInCoordinate(coordinate);
        neighboursCoordinates = new CoordinatesOfNeighbours(coordinate,sizeWorld);
    }

    @Test
    public void a_cell_dies_because_number_of_neighbours_lives_are_menor_than_two() {
        cell.live();

        world.getCellInCoordinate(neighboursCoordinates.neighbourTopLeft()).live();
        world.getCellInCoordinate(neighboursCoordinates.neighbourTop()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourTopRight()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourRight()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourBottomRight()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourBottom()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourBottomLeft()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourLeft()).die();

        CellStateEvaluator.evaluate(cell, world);

        assertFalse(cell.itsAliveNextGeneration());
    }

    @Test
    public void a_cell_keep_live_when_has_two_or_tree_neighbours_lives() {
        cell.live();

        world.getCellInCoordinate(neighboursCoordinates.neighbourTopLeft()).live();
        world.getCellInCoordinate(neighboursCoordinates.neighbourTop()).live();
        world.getCellInCoordinate(neighboursCoordinates.neighbourTopRight()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourRight()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourBottomRight()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourBottom()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourBottomLeft()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourLeft()).die();

        CellStateEvaluator.evaluate(cell, world);

        assertTrue(cell.itsAliveNextGeneration());
    }

    @Test
    public void if_a_cell_has_more_than_tree_neighbours_lives_the_cell_dies() {
        cell.live();

        world.getCellInCoordinate(neighboursCoordinates.neighbourTopLeft()).live();
        world.getCellInCoordinate(neighboursCoordinates.neighbourTop()).live();
        world.getCellInCoordinate(neighboursCoordinates.neighbourTopRight()).live();
        world.getCellInCoordinate(neighboursCoordinates.neighbourRight()).live();
        world.getCellInCoordinate(neighboursCoordinates.neighbourBottomRight()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourBottom()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourBottomLeft()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourLeft()).die();

        CellStateEvaluator.evaluate(cell, world);

        assertFalse(cell.itsAliveNextGeneration());
    }

    @Test
    public void a_cell_revive_because_number_of_neighbours_lives_are_tree() {
        cell.die();

        world.getCellInCoordinate(neighboursCoordinates.neighbourTopLeft()).live();
        world.getCellInCoordinate(neighboursCoordinates.neighbourTop()).live();
        world.getCellInCoordinate(neighboursCoordinates.neighbourTopRight()).live();
        world.getCellInCoordinate(neighboursCoordinates.neighbourRight()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourBottomRight()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourBottom()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourBottomLeft()).die();
        world.getCellInCoordinate(neighboursCoordinates.neighbourLeft()).die();

        CellStateEvaluator.evaluate(cell, world);

        assertTrue(cell.itsAliveNextGeneration());
    }

}
