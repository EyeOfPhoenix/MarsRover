package marsrover.usecase.rover;

import marsrover.domain.Direction;
import marsrover.domain.mars.Mars;
import marsrover.domain.rover.Rover;

public class RoverExplorationUseCase implements IRoverExplorationUseCase {
    private final Rover rover;
    private final Mars mars;

    public RoverExplorationUseCase(Rover rover, Mars mars) {
        this.rover = rover;
        this.mars = mars;
    }

    public void explore() {
        while (rover.executeCommands()) {}
    }

    @Override
    public int getRoverPositionX() {
        return rover.getPositionX();
    }

    @Override
    public int getRoverPositionY() {
        return rover.getPositionY();
    }

    @Override
    public Direction getRoverDirection() {
        return rover.getDirection();
    }

    public void setCommandsForRover(String commands) {
        rover.setCommands(commands);
    }
}
