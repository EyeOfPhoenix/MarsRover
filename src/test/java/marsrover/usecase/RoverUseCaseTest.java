package marsrover.usecase;

import marsrover.domain.Direction;
import marsrover.usecase.rover.RoverUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoverUseCaseTest {
    @Test
    void should_init_the_position() {
        RoverUseCase roverUseCase = new RoverUseCase();

        roverUseCase.initPosition(2, 6, Direction.S);

        Assertions.assertEquals(roverUseCase.getPositionX(), 2);
        Assertions.assertEquals(roverUseCase.getPositionY(), 6);
        Assertions.assertEquals(roverUseCase.getDirection(), Direction.S);
    }
}