package marsrover.usecase.rover;

import marsrover.domain.Direction;
import marsrover.domain.Object;
import marsrover.domain.mars.Mars;
import marsrover.domain.rover.Rover;

public class RoverExplorationUseCase implements IRoverExplorationUseCase {
    private final Rover rover;
    private final Mars mars;
    private String rapport;

    public RoverExplorationUseCase(Rover rover, Mars mars) {
        this.rover = rover;
        this.mars = mars;
        mars.putObject(3, 4, Object.OBSTACLE);
        rapport = "";
    }

    public void explore() {
        while (rover.executeCommands()) {
            Object object = mars.seeAtPosition(rover.getPositionX(), rover.getPositionY());

            if(Object.OBSTACLE.equals(object)) {
                rapport = "Obstacle encounter at position(" + rover.getPositionX() + "," + rover.getPositionY() + ").";
                rover.moveToTheLastPosition();

                return;
            }
        }

        rapport = "Commands executed with success !";
    }

    @Override
    public String getRapport() {
        return rapport;
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
