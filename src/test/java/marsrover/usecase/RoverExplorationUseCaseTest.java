package marsrover.usecase;

import marsrover.domain.Direction;
import marsrover.domain.mars.Mars;
import marsrover.domain.rover.Rover;
import marsrover.usecase.rover.RoverExplorationUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoverExplorationUseCaseTest {
    @Test
    void should_init_the_position_of_the_rover() {
        Rover rover = new Rover(2, 6, Direction.S);
        Mars mars = new Mars(5, 5);

        RoverExplorationUseCase roverExplorationUseCase = new RoverExplorationUseCase(rover, mars);

        Assertions.assertEquals(roverExplorationUseCase.getRoverPositionX(), 2);
        Assertions.assertEquals(roverExplorationUseCase.getRoverPositionY(), 6);
        Assertions.assertEquals(roverExplorationUseCase.getRoverDirection(), Direction.S);
    }

    @Test
    void should_explore_mars_wow() {
        Rover rover = new Rover(2, 6, Direction.S);
        Mars mars = new Mars(5, 5);
        RoverExplorationUseCase roverExplorationUseCase = new RoverExplorationUseCase(rover, mars);
        roverExplorationUseCase.setCommandsForRover("lf");

        roverExplorationUseCase.explore();

        Assertions.assertEquals(roverExplorationUseCase.getRoverPositionX(), 3);
        Assertions.assertEquals(roverExplorationUseCase.getRoverPositionY(), 6);
        Assertions.assertEquals(roverExplorationUseCase.getRoverDirection(), Direction.E);
    }

    @Test
    void should_stop_walk_if_an_obstacle_encounter() {
        Rover rover = new Rover(2, 4, Direction.E);
        Mars mars = new Mars(5, 5);
        RoverExplorationUseCase roverExplorationUseCase = new RoverExplorationUseCase(rover, mars);
        roverExplorationUseCase.setCommandsForRover("f1");

        roverExplorationUseCase.explore();

        Assertions.assertEquals(roverExplorationUseCase.getRoverPositionX(), 2);
        Assertions.assertEquals(roverExplorationUseCase.getRoverPositionY(), 4);
        Assertions.assertEquals(roverExplorationUseCase.getRoverDirection(), Direction.E);
    }

    @Test
    void should_print_a_rapport_failed() {
        Rover rover = new Rover(2, 4, Direction.E);
        Mars mars = new Mars(5, 5);
        RoverExplorationUseCase roverExplorationUseCase = new RoverExplorationUseCase(rover, mars);
        roverExplorationUseCase.setCommandsForRover("f1");

        roverExplorationUseCase.explore();

        Assertions.assertEquals(roverExplorationUseCase.getRoverPositionX(), 2);
        Assertions.assertEquals(roverExplorationUseCase.getRoverPositionY(), 4);
        Assertions.assertEquals(roverExplorationUseCase.getRoverDirection(), Direction.E);
        Assertions.assertEquals(roverExplorationUseCase.showRapport(), "Obstacle encounter at position(3,4).");
    }
}