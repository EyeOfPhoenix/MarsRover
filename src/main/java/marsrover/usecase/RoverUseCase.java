package marsrover.usecase;

import marsrover.domain.Direction;
import marsrover.domain.Rover;

public class RoverUseCase implements IRoverUseCase {
    private final Rover rover;

    public RoverUseCase() {
        rover = new Rover();
    }

    public void initPosition(int x, int y, Direction direction) {
        this.rover.setPositionX(x);
        this.rover.setPositionY(y);
        this.rover.setDirection(direction);
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
