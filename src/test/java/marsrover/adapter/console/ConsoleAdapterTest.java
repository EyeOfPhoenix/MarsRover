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

}