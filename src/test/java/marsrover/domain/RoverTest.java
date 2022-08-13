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
}