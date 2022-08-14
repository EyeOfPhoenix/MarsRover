package marsrover.domain.rover;

import marsrover.domain.Direction;

public class Rover {
    private final int NB_DIRECTIONS = 4;
    private int positionX;
    private int positionY;
    private Direction direction;
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

    public Direction getDirection() {
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

    public void moveBackward(int steps) {
        switch (direction) {
            case S -> positionY += steps;
            case N -> positionY -= steps;
            case W -> positionX += steps;
            case E -> positionX -= steps;
        }
    }

    public void turnLeft() {
        int newDirection = (direction.getDirectionValue() + 1) % NB_DIRECTIONS;

        this.direction = Direction.VALUE.getDirectionFromValue(newDirection);
    }

    public void turnRight() {
        int newDirection = (direction.getDirectionValue() - 1) % NB_DIRECTIONS;

        if (newDirection >= 0) {
            this.direction = Direction.VALUE.getDirectionFromValue(newDirection);
        }
        else {
            this.direction = Direction.W;
        }

    }
}
