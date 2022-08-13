package marsrover.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {
    @Test
    void should_get_x() {
        Point point = new Point();

        point.setX(5);

        Assertions.assertEquals(point.getX(), 5);
    }

    @Test
    void should_get_y() {
        Point point = new Point();

        point.setY(2);

        Assertions.assertEquals(point.getY(), 2);
    }
}