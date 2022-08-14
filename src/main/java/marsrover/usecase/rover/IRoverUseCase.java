package marsrover.usecase.rover;

import marsrover.domain.Direction;

public interface IRoverUseCase {
    int getPositionX();
    int getPositionY();
    Direction getDirection();
}
