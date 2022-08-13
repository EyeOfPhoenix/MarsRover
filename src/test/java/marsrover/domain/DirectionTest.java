package marsrover.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {
    @Test
    void should_go_to_s() {
        Direction direction = new Direction();

        direction.gotoS();

        Assertions.assertEquals(direction.where(), 'S');
    }
}