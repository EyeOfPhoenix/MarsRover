package marsrover.domain;

import marsrover.domain.rover.Rover;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoverTest {
    @Test
    void should_set_the_position_x() {
        Rover rover = new Rover(5, 2, Direction.S);

        Assertions.assertEquals(rover.getPositionX(), 5);
    }

    @Test
    void should_set_the_position_y() {
        Rover rover = new Rover(1, 4, Direction.S);

        Assertions.assertEquals(rover.getPositionY(), 4);
    }

    @Test
    void should_set_a_direction() {
        Rover rover = new Rover(1, 2, Direction.S);

        Assertions.assertEquals(rover.getDirection(), Direction.S);
    }

    @Test
    void should_receive_a_character_array_of_commands() {
        Rover rover = new Rover(1, 2, Direction.S);

        rover.setCommands("S100E5");

        Assertions.assertEquals(rover.getCommands(), "S100E5");
    }

    @Test
    void should_move_forward_when_direction_is_s() {
        Rover rover = new Rover(1, 2, Direction.S);

        rover.moveForward(100);

        Assertions.assertEquals(rover.getPositionY(), -98);
    }

    @Test
    void should_move_forward_when_direction_is_n() {
        Rover rover = new Rover(1, 2, Direction.N);

        rover.moveForward(100);

        Assertions.assertEquals(rover.getPositionY(), 102);
    }

    @Test
    void should_move_forward_when_direction_is_w() {
        Rover rover = new Rover(1, 2, Direction.W);

        rover.moveForward(100);

        Assertions.assertEquals(rover.getPositionX(), -99);
    }

    @Test
    void should_move_forward_when_direction_is_e() {
        Rover rover = new Rover(1, 2, Direction.E);

        rover.moveForward(100);

        Assertions.assertEquals(rover.getPositionX(), 101);
    }

    @Test
    void should_move_backward_when_direction_is_s() {
        Rover rover = new Rover(1, 2, Direction.S);

        rover.moveBackward(100);

        Assertions.assertEquals(rover.getPositionY(), 102);
    }

    @Test
    void should_move_backward_when_direction_is_n() {
        Rover rover = new Rover(1, 2, Direction.N);

        rover.moveBackward(100);

        Assertions.assertEquals(rover.getPositionY(), -98);
    }

    @Test
    void should_move_backward_when_direction_is_w() {
        Rover rover = new Rover(1, 2, Direction.W);

        rover.moveBackward(100);

        Assertions.assertEquals(rover.getPositionX(), 101);
    }

    @Test
    void should_move_backward_when_direction_is_e() {
        Rover rover = new Rover(1, 2, Direction.E);

        rover.moveBackward(100);

        Assertions.assertEquals(rover.getPositionX(), -99);
    }

    @Test
    void should_turn_left_when_direction_is_s() {
        Rover rover = new Rover(1, 2, Direction.S);

        rover.turnLeft();

        Assertions.assertEquals(rover.getDirection(), Direction.E);
    }

    @Test
    void should_turn_left_when_direction_is_e() {
        Rover rover = new Rover(1, 2, Direction.E);

        rover.turnLeft();

        Assertions.assertEquals(rover.getDirection(), Direction.N);
    }

    @Test
    void should_turn_left_when_direction_is_n() {
        Rover rover = new Rover(1, 2, Direction.N);

        rover.turnLeft();

        Assertions.assertEquals(rover.getDirection(), Direction.W);
    }

    @Test
    void should_turn_left_when_direction_is_w() {
        Rover rover = new Rover(1, 2, Direction.W);

        rover.turnLeft();

        Assertions.assertEquals(rover.getDirection(), Direction.S);
    }

    @Test
    void should_turn_right_when_direction_is_s() {
        Rover rover = new Rover(1, 2, Direction.S);

        rover.turnRight();

        Assertions.assertEquals(rover.getDirection(), Direction.W);
    }

    @Test
    void should_turn_right_when_direction_is_w() {
        Rover rover = new Rover(1, 2, Direction.W);

        rover.turnRight();

        Assertions.assertEquals(rover.getDirection(), Direction.N);
    }

    @Test
    void should_turn_right_when_direction_is_n() {
        Rover rover = new Rover(1, 2, Direction.N);

        rover.turnRight();

        Assertions.assertEquals(rover.getDirection(), Direction.E);
    }

    @Test
    void should_turn_right_when_direction_is_e() {
        Rover rover = new Rover(1, 2, Direction.E);

        rover.turnRight();

        Assertions.assertEquals(rover.getDirection(), Direction.S);
    }

    @Test
    void should_always_walk() {
        Rover rover = new Rover(1, 2, Direction.S);
        rover.setCommands("f3 l3 b2 r2");

        boolean isWalking = rover.executeCommands();

        Assertions.assertEquals(rover.getPositionX(), 1);
        Assertions.assertEquals(rover.getPositionY(), -1);
        Assertions.assertEquals(rover.getDirection(), Direction.S);
        Assertions.assertTrue(isWalking);
    }

    @Test
    void should_execute_the_commands() {
        Rover rover = new Rover(1, 2, Direction.S);
        rover.setCommands("f3 l3 b2 r2");

        rover.executeCommands();
        rover.executeCommands();
        rover.executeCommands();
        rover.executeCommands();
        boolean isWalking = rover.executeCommands();

        Assertions.assertEquals(rover.getPositionX(), 3);
        Assertions.assertEquals(rover.getPositionY(), -1);
        Assertions.assertEquals(rover.getDirection(), Direction.E);
        Assertions.assertFalse(isWalking);
    }

    @Test
    void should_move_up_to_the_last_position() {
        Rover rover = new Rover(2, 3, Direction.S);
        rover.setCommands("b2");

        rover.executeCommands();
        rover.moveToTheLastPosition();

        Assertions.assertEquals(rover.getPositionX(), 2);
        Assertions.assertEquals(rover.getPositionY(), 3);
        Assertions.assertEquals(rover.getDirection(), Direction.S);
    }
}