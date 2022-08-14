package marsrover;

import marsrover.adapter.console.ConsoleAdapter;
import marsrover.domain.Direction;
import marsrover.usecase.rover.IRoverUseCase;
import marsrover.usecase.rover.RoverUseCase;

public class MarsRoverApplication {
    public static void main(String[] args) {
        IRoverUseCase iRoverUseCase = new RoverUseCase(24, 12, Direction.S);

        ConsoleAdapter consoleAdapter = new ConsoleAdapter(iRoverUseCase);

        consoleAdapter.print();
    }
}
