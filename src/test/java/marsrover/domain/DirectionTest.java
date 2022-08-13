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

    @Test
    void should_go_to_w() {
        Direction direction = new Direction();

        direction.gotoW();

        Assertions.assertEquals(direction.where(), 'W');
    }

    @Test
    void should_go_to_n() {
        Direction direction = new Direction();

        direction.gotoN();

        Assertions.assertEquals(direction.where(), 'N');
    }

    @Test
    void should_go_to_e() {
        Direction direction = new Direction();

        direction.gotoE();

        Assertions.assertEquals(direction.where(), 'E');
    }
}