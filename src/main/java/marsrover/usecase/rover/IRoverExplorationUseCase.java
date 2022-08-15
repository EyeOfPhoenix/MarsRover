package marsrover.usecase.rover;

import marsrover.domain.Direction;

public interface IRoverExplorationUseCase {
    int getRoverPositionX();
    int getRoverPositionY();
    Direction getRoverDirection();
}
