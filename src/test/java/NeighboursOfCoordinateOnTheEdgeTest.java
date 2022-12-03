import org.blackcat.Aplication.NeighboursOfCoordinate;
import org.blackcat.Entity.Coordinate;
import org.blackcat.Entity.SizeWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NeighboursOfCoordinateOnTheEdgeTest {

    SizeWorld sizeWorld;

    public NeighboursOfCoordinateOnTheEdgeTest() {
        sizeWorld = new SizeWorld(4, 4);
    }

    private NeighboursOfCoordinate prepareNeighboursForCoordinate(int x, int y) {
        return new NeighboursOfCoordinate(
                new Coordinate(x, y),
                sizeWorld
        );
    }

    @Test
    public void coordinate_has_neighbours_edge_top_left() {
        NeighboursOfCoordinate neighbour = prepareNeighboursForCoordinate(0,0);

        Coordinate coordinateNeighbour = neighbour.neighbourTopLeft();

        assertEquals(sizeWorld.sizeX - 1, coordinateNeighbour.x);
        assertEquals(sizeWorld.sizeY - 1, coordinateNeighbour.y);
    }

    @Test
    public void coordinate_has_neighbours_edge_top() {
        NeighboursOfCoordinate neighbour = prepareNeighboursForCoordinate(1,0);

        Coordinate coordinateNeighbour = neighbour.neighbourTop();

        assertEquals(1, coordinateNeighbour.x);
        assertEquals(sizeWorld.sizeY - 1, coordinateNeighbour.y);
    }

    @Test
    public void coordinate_has_neighbours_edge_top_right() {
        NeighboursOfCoordinate neighbour = prepareNeighboursForCoordinate(sizeWorld.sizeX -1,0);

        Coordinate coordinateNeighbour = neighbour.neighbourTopRight();

        assertEquals(0, coordinateNeighbour.x);
        assertEquals(sizeWorld.sizeY - 1, coordinateNeighbour.y);
    }

    @Test
    public void coordinate_has_neighbours_edge_right() {
        NeighboursOfCoordinate neighbour = prepareNeighboursForCoordinate(sizeWorld.sizeX -1, 1);

        Coordinate coordinateNeighbour = neighbour.neighbourRight();

        assertEquals(0, coordinateNeighbour.x);
        assertEquals(1, coordinateNeighbour.y);
    }

    @Test
    public void coordinate_has_neighbours_edge_bottom_right() {
        NeighboursOfCoordinate neighbour = prepareNeighboursForCoordinate(sizeWorld.sizeX -1,sizeWorld.sizeY - 1);

        Coordinate coordinateNeighbour = neighbour.neighbourBottomRight();

        assertEquals(0, coordinateNeighbour.x);
        assertEquals(0, coordinateNeighbour.y);
    }

    @Test
    public void coordinate_has_neighbours_edge_bottom() {
        NeighboursOfCoordinate neighbour = prepareNeighboursForCoordinate(1,sizeWorld.sizeY - 1);

        Coordinate coordinateNeighbour = neighbour.neighbourBottom();

        assertEquals(1, coordinateNeighbour.x);
        assertEquals(0, coordinateNeighbour.y);
    }

    @Test
    public void coordinate_has_neighbours_edge_bottom_left() {
        NeighboursOfCoordinate neighbour = prepareNeighboursForCoordinate(0,sizeWorld.sizeY - 1);

        Coordinate coordinateNeighbour = neighbour.neighbourBottomLeft();

        assertEquals(sizeWorld.sizeX - 1, coordinateNeighbour.x);
        assertEquals(0, coordinateNeighbour.y);
    }

    @Test
    public void coordinate_has_neighbours_edge_left() {
        NeighboursOfCoordinate neighbour = prepareNeighboursForCoordinate(0,1);

        Coordinate coordinateNeighbour = neighbour.neighbourLeft();

        assertEquals(sizeWorld.sizeX - 1, coordinateNeighbour.x);
        assertEquals(1, coordinateNeighbour.y);
    }
}
