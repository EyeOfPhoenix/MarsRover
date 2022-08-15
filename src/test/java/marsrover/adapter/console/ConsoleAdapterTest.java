package marsrover.adapter.console;

import marsrover.domain.Direction;
import marsrover.domain.mars.Mars;
import marsrover.domain.rover.Rover;
import marsrover.usecase.rover.IRoverExplorationUseCase;
import marsrover.usecase.rover.RoverExplorationUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ConsoleAdapterTest {

    @Test
    void should_print_the_position_of_a_rover() {
        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        Rover rover = new Rover(5, 9, Direction.S);
        Mars mars = new Mars(5, 5);
        IRoverExplorationUseCase IRoverExplorationUseCase = new RoverExplorationUseCase(rover, mars);

        ConsoleAdapter consoleAdapter = new ConsoleAdapter(IRoverExplorationUseCase);

        consoleAdapter.print();
        Assertions.assertEquals("Rover(5, 9, S)", outputStreamCaptor.toString().trim());
    }

    @Test
    void should_print_the_position_of_the_rover_failed() {
        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        Rover rover = new Rover(2, 4, Direction.E);
        Mars mars = new Mars(5, 5);
        RoverExplorationUseCase iRoverExplorationUseCase = new RoverExplorationUseCase(rover, mars);
        iRoverExplorationUseCase.setCommandsForRover("f");
        ConsoleAdapter consoleAdapter = new ConsoleAdapter(iRoverExplorationUseCase);

        iRoverExplorationUseCase.explore();

        consoleAdapter.print();
        Assertions.assertEquals("Rover(2, 4, E)\nObstacle encounter at position(3,4).", outputStreamCaptor.toString().trim());
    }

    @Test
    void should_print_the_position_of_the_rover_success() {
        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        Rover rover = new Rover(1, 4, Direction.E);
        Mars mars = new Mars(5, 5);
        RoverExplorationUseCase iRoverExplorationUseCase = new RoverExplorationUseCase(rover, mars);
        iRoverExplorationUseCase.setCommandsForRover("f");
        ConsoleAdapter consoleAdapter = new ConsoleAdapter(iRoverExplorationUseCase);

        iRoverExplorationUseCase.explore();

        consoleAdapter.print();
        Assertions.assertEquals("Rover(2, 4, E)\nCommands executed with success !", outputStreamCaptor.toString().trim());
    }
}