package marsrover.usecase.rover;

import marsrover.domain.Direction;
import marsrover.domain.rover.Rover;

public class RoverUseCase implements IRoverUseCase {
    private final Rover rover;

    public RoverUseCase(int positionX, int positionY, Direction direction) {
        rover = new Rover(positionX, positionY, direction);
    }

    @Override
    public int getPositionX() {
        return rover.getPositionX();
    }

    @Override
    public int getPositionY() {
        return rover.getPositionY();
    }

    @Override
    public Direction getDirection() {
        return rover.where();
    }
}
