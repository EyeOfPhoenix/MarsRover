package marsrover.domain;

public enum Direction {
    S(0),
    E(1),
    N(2),
    W(3),
    VALUE(4);

    private final int valueDirection;

    Direction(int direction) {
        this.valueDirection = direction;
    }

    public int getDirectionValue() {
        return valueDirection;
    }

    public Direction getDirectionFromValue(int value) {
        return switch (value) {
            case 0 -> Direction.S;
            case 1 -> Direction.E;
            case 2 -> Direction.N;
            case 3 -> Direction.W;
            default -> Direction.VALUE;
        };
    }
}
