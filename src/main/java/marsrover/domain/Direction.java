package marsrover.domain;

public class Direction {
    private char direction;

    public void gotoS() {
        this.direction = 'S';
    }

    public char where() {
        return this.direction;
    }
}
