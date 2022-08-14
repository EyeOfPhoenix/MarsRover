package marsrover.domain.rover;

import marsrover.domain.Direction;

public class Rover {
    private int positionX;
    private int positionY;
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

    public void moveForward(int steps) {
        switch (direction) {
            case S -> positionY -= steps;
            case N -> positionY += steps;
            case W -> positionX -= steps;
            case E -> positionX += steps;
        }
    }
}
