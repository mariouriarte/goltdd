import org.blackcat.Aplication.NeighboursOfCoordinate;
import org.blackcat.Entity.Cell;
import org.blackcat.Entity.Coordinate;
import org.blackcat.Entity.SizeWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NeighboursOfCellTest {

    @Test
    public void cell_has_live_neighbours() {

        Coordinate coordinate = new Coordinate(1, 1);

        NeighboursOfCoordinate neighboursOfCoordinate = new NeighboursOfCoordinate(
            coordinate,
            new SizeWorld(4, 4)
        );

        Cell cell = new Cell(coordinate);


    }
}
