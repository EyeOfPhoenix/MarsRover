package marsrover.domain.rover;

import marsrover.domain.Direction;

public class Rover {
    private int positionX;
    private int positionY;
    private Direction direction;

    public void setPositionX(int x) {
        this.positionX = x;
    }

    public void setPositionY(int y) {
        this.positionY = y;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public Direction where() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
