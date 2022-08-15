package marsrover;

import marsrover.adapter.console.ConsoleAdapter;
import marsrover.domain.Direction;
import marsrover.domain.mars.Mars;
import marsrover.domain.rover.Rover;
import marsrover.usecase.rover.IRoverExplorationUseCase;
import marsrover.usecase.rover.RoverExplorationUseCase;

public class MarsRoverApplication {
    public static void main(String[] args) {
        Rover rover = new Rover(24, 12, Direction.S);
        Mars mars = new Mars(5, 5);
        IRoverExplorationUseCase iRoverExplorationUseCase = new RoverExplorationUseCase(rover, mars);

        ConsoleAdapter consoleAdapter = new ConsoleAdapter(iRoverExplorationUseCase);

        consoleAdapter.print();
    }
}
