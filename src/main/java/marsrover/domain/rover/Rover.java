package marsrover.domain.rover;

import marsrover.domain.Direction;

import java.util.*;

public class Rover {
    private final int NB_DIRECTIONS = 4;
    private int positionX;
    private int lastPositionX;
    private int positionY;
    private int lastPositionY;
    private Direction direction;
    private String commands;
    private List<String> commandsToBeExecuted;

    public Rover(int positionX, int positionY, Direction direction) {
        this.positionX = lastPositionX = positionX;
        this.positionY = lastPositionY = positionY;
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
        commandsToBeExecuted = new LinkedList<>(Arrays.asList(commands.split(" ")));
    }

    public String getCommands() {
        return commands;
    }

    public Direction getDirection() {
        return direction;
    }

    public void moveForward(int steps) {
        lastPositionX = positionX;
        switch (direction) {
            case S -> positionY -= steps;
            case N -> positionY += steps;
            case W -> positionX -= steps;
            case E -> positionX += steps;
        }
    }

    public void moveBackward(int steps) {
        lastPositionY = positionY;
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

    public boolean executeCommands() {
        if(commandsToBeExecuted.size() == 0) {
            return false;
        }

        String commandToBeExe = commandsToBeExecuted.get(0);
        char move = commandToBeExe.toUpperCase().charAt(0);
        int steps = Integer.parseInt(commandToBeExe.substring(1, commandToBeExe.length()));
        commandsToBeExecuted.remove(0);

        switch (move) {
            case 'F':
                moveForward(steps);
                return true;
            case 'B':
                moveBackward(steps);
                return true;
            case 'L':
                for(int i=0; i<steps; i++) turnLeft();
                return true;
            case 'R':
                for(int i=0; i<steps; i++) turnRight();
        }

        return true;
    }

    public void moveToTheLastPosition() {
        positionX = lastPositionX;
        positionY = lastPositionY;
    }
}
