package marsrover.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    @Test
    void should_set_the_position_x() {
        Rover rover = new Rover();

        rover.setPositionX(5);

        Assertions.assertEquals(rover.getPositionX(), 5);
    }

    @Test
    void should_set_the_position_y() {
        Rover rover = new Rover();

        rover.setPositionY(4);

        Assertions.assertEquals(rover.getPositionY(), 4);
    }

    @Test
    void should_go_to_s() {
        Rover rover = new Rover();

        rover.gotoS();

        Assertions.assertEquals(rover.where(), Direction.S);
    }

    @Test
    void should_go_to_n() {
        Rover rover = new Rover();

        rover.gotoN();

        Assertions.assertEquals(rover.where(), Direction.N);
    }
}