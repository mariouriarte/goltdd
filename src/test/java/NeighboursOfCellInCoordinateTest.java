import org.blackcat.Aplication.CoordinatesOfNeighbours;
import org.blackcat.Aplication.NeighboursOfCellInCoordinate;
import org.blackcat.Entity.Coordinate;
import org.blackcat.Entity.SizeWorld;
import org.blackcat.Entity.World;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NeighboursOfCellInCoordinateTest {

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

        NeighboursOfCellInCoordinate neighbours = new NeighboursOfCellInCoordinate(world);
        neighbours.setCoordinate(coordinate);

        assertEquals(8, neighbours.numberOfLivesCells());
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

        NeighboursOfCellInCoordinate neighbours = new NeighboursOfCellInCoordinate(world);
        neighbours.setCoordinate(coordinate);

        assertEquals(0, neighbours.numberOfLivesCells());
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

        NeighboursOfCellInCoordinate neighbours = new NeighboursOfCellInCoordinate(world);
        neighbours.setCoordinate(coordinate);

        assertEquals(4, neighbours.numberOfLivesCells());
        assertEquals(4, neighbours.numberOfDiedCells());
    }
}
