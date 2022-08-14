package marsrover.usecase.rover;

import marsrover.domain.Direction;
import marsrover.domain.rover.Rover;

public class RoverUseCase implements IRoverUseCase {
    private final Rover rover;

    public RoverUseCase() {
        rover = new Rover();
    }

    public RoverUseCase(int x, int y, Direction direction) {
        rover = new Rover();
        this.rover.setPositionX(x);
        this.rover.setPositionY(y);
        this.rover.setDirection(direction);
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
