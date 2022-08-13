package marsrover.domain;

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

    public void gotoS() {
        direction = Direction.S;
    }

    public void gotoN() {
        direction = Direction.N;
    }

    public Direction where() {
        return direction;
    }
}
