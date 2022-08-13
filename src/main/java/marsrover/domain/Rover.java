package marsrover.domain;

public class Rover {
    private final Point point;

    public Rover() {
        point = new Point();
    }

    public void setPositionX(int x) {
        point.setX(x);
    }

    public int getPositionX() {
        return point.getX();
    }
}
