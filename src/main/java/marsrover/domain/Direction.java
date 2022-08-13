package marsrover.domain;

public class Direction {
    private char direction;

    public void gotoS() {
        this.direction = 'S';
    }

    public void gotoW() {
        this.direction = 'W';
    }

    public char where() {
        return this.direction;
    }
}
