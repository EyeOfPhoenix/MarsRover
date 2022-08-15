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

        RoverExplorationUseCase roverExplorationUseCase = new RoverExplorationUseCase(rover, mars);
        IRoverExplorationUseCase iRoverExplorationUseCase = roverExplorationUseCase;

        ConsoleAdapter consoleAdapter = new ConsoleAdapter(iRoverExplorationUseCase);
        consoleAdapter.print(); // show position of the rover

        System.out.println("\n");

        //Obstacle use case.
        {
            rover = new Rover(1, 1, Direction.E);
            roverExplorationUseCase = new RoverExplorationUseCase(rover, mars);
            roverExplorationUseCase.setCommandsForRover("ffrbbbbbb");
            roverExplorationUseCase.explore();
            iRoverExplorationUseCase = roverExplorationUseCase;
            consoleAdapter = new ConsoleAdapter(iRoverExplorationUseCase);
            consoleAdapter.print(); // show message rover encountered an obstacle
        }

        System.out.println("\n");

        // No obstacle use case
        {
            rover = new Rover(1, 1, Direction.E);
            roverExplorationUseCase = new RoverExplorationUseCase(rover, mars);
            roverExplorationUseCase.setCommandsForRover("ffrbbrflf");
            roverExplorationUseCase.explore();
            iRoverExplorationUseCase = roverExplorationUseCase;
            consoleAdapter = new ConsoleAdapter(iRoverExplorationUseCase);
            consoleAdapter.print(); // show message the rover has executed all commands
        }
    }
}
