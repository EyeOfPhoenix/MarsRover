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

}