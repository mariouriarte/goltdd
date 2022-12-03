import org.blackcat.Aplication.Exception.CoordinateOutBoundException;
import org.blackcat.Entity.Coordinate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoordinateTest {

    @Test
    public void new_coordinate_whit_negative_numbers_throws_exception() {

        RuntimeException exception = assertThrows(CoordinateOutBoundException.class, () -> {
            new Coordinate(-1, -1);
        });

        String expectedMessage = "Indexes can't be negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void new_coordinate_has_true_xy_coordinates() {
        Coordinate coordinate = new Coordinate(2, 1);

        assertEquals(coordinate.x, 2);
        assertEquals(coordinate.y, 1);
    }
}
