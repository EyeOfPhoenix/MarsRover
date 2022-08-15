package marsrover.domain.rover;

import marsrover.domain.Direction;

import java.util.*;

public class Rover {
    private final int NB_DIRECTIONS = 4;
    private int positionX;
    private int positionY;
    private Direction direction;
    private String commands;
    private List<String> commandsToBeExecuted;
    private boolean isWalking;

    public Rover(int positionX, int positionY, Direction direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
        isWalking = false;
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

    public void executeCommands() {
        if(commandsToBeExecuted.size() == 0) {
            isWalking = false;
            return;
        }

        isWalking = true;
        String commandToBeExe = commandsToBeExecuted.get(0);
        char move = commandToBeExe.toUpperCase().charAt(0);
        int steps = Integer.parseInt(commandToBeExe.substring(1, commandToBeExe.length()));
        commandsToBeExecuted.remove(0);

        switch (move) {
            case 'F':
                moveForward(steps);
                return;
            case 'B':
                moveBackward(steps);
                return;
            case 'L':
                for(int i=0; i<steps; i++) turnLeft();
                return;
            case 'R':
                for(int i=0; i<steps; i++) turnRight();
        }
    }

    public boolean isWalking() {
        return isWalking;
    }
}
