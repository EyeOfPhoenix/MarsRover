package marsrover.domain.rover;

import marsrover.domain.Direction;

public class Rover {
    private final int positionX;
    private final int positionY;
    private final Direction direction;
    private String commands;

    public Rover(int positionX, int positionY, Direction direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public String getCommands() {
        return commands;
    }

    public Direction where() {
        return direction;
    }
}
