package marsrover.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void should_get_x() {
        Point point = new Point();

        point.setX(5);

        Assertions.assertEquals(point.getX(), 5);
    }
}