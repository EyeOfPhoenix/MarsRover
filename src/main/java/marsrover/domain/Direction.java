package marsrover.domain;

public class Direction {
    private char direction;

    public void gotoS() {
        this.direction = 'S';
    }

    public void gotoW() {
        this.direction = 'W';
    }

    public void gotoN() {
        this.direction = 'N';
    }

    public void gotoE() {
        this.direction = 'E';
    }

    public char where() {
        return this.direction;
    }
}
