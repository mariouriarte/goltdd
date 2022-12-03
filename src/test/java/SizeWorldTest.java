import org.blackcat.Aplication.Exception.SizeMinimalWorldException;
import org.blackcat.Entity.SizeWorld;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SizeWorldTest {

    @Test
    public void size_world_cant_be_minor_than_four() {

        RuntimeException exception = assertThrows(SizeMinimalWorldException.class, () -> {
            new SizeWorld(3, 3);
        });

        String expectedMessage = "Size minimal can't be minor than 4";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
