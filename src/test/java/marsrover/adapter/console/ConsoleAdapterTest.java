package marsrover.adapter.console;

import marsrover.domain.Direction;
import marsrover.usecase.rover.IRoverUseCase;
import marsrover.usecase.rover.RoverUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleAdapterTest {

    @Test
    void should_print_the_position_of_a_rover() {
        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        IRoverUseCase IRoverUseCase = new RoverUseCase(5, 9, Direction.S);

        ConsoleAdapter consoleAdapter = new ConsoleAdapter(IRoverUseCase);

        consoleAdapter.print();
        Assertions.assertEquals("Rover(5, 9, S)", outputStreamCaptor.toString().trim());
    }

}