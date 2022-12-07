import org.blackcat.Aplication.CoordinatesOfNeighbours;
import org.blackcat.Aplication.NeighboursOfCell;
import org.blackcat.Entity.Coordinate;
import org.blackcat.Entity.SizeWorld;
import org.blackcat.Entity.World;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NeighboursOfCellTest {

    @Test
    public void a_cell_has_all_lives_neighbours() {

        SizeWorld sizeWorld = new SizeWorld(4, 4);
        Coordinate coordinate = new Coordinate(0, 0);

        World world = World.empty(sizeWorld);
        world.populateAllCells();

        CoordinatesOfNeighbours coordinates = new CoordinatesOfNeighbours(coordinate, sizeWorld);

        List<Coordinate> coordinateList = coordinates.getAll();

        for (Coordinate item : coordinateList) {
            world.getCellInCoordinate(item).live();
        }

        NeighboursOfCell neighbours = new NeighboursOfCell(world);
        neighbours.setCoordinate(coordinate);

        assertEquals(8, neighbours.numberOfLives());
    }

    @Test
    public void a_cell_has_all_died_neighbours() {

        SizeWorld sizeWorld = new SizeWorld(4, 4);
        Coordinate coordinate = new Coordinate(0, 0);

        World world = World.empty(sizeWorld);
        world.populateAllCells();

        CoordinatesOfNeighbours coordinates = new CoordinatesOfNeighbours(coordinate, sizeWorld);

        List<Coordinate> coordinateList = coordinates.getAll();

        for (Coordinate item : coordinateList) {
            world.getCellInCoordinate(item).die();
        }

        NeighboursOfCell neighbours = new NeighboursOfCell(world);
        neighbours.setCoordinate(coordinate);

        assertEquals(0, neighbours.numberOfLives());
    }

    @Test
    public void a_cell_has_half_lives_neighbours() {
        SizeWorld sizeWorld = new SizeWorld(4, 4);
        Coordinate coordinate = new Coordinate(0, 0);

        World world = World.empty(sizeWorld);
        world.populateAllCells();

        CoordinatesOfNeighbours coordinates = new CoordinatesOfNeighbours(coordinate, sizeWorld);

        world.getCellInCoordinate(coordinates.neighbourTopLeft()).live();
        world.getCellInCoordinate(coordinates.neighbourTop()).live();
        world.getCellInCoordinate(coordinates.neighbourTopRight()).live();
        world.getCellInCoordinate(coordinates.neighbourRight()).live();

        world.getCellInCoordinate(coordinates.neighbourBottomRight()).die();
        world.getCellInCoordinate(coordinates.neighbourBottom()).die();
        world.getCellInCoordinate(coordinates.neighbourBottomLeft()).die();
        world.getCellInCoordinate(coordinates.neighbourLeft()).die();

        NeighboursOfCell neighbours = new NeighboursOfCell(world);
        neighbours.setCoordinate(coordinate);

        assertEquals(4, neighbours.numberOfLives());
        assertEquals(4, neighbours.numberOfDied());
    }
}
