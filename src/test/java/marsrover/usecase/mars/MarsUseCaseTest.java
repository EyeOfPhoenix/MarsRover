package marsrover.usecase.mars;

import marsrover.domain.Object;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MarsUseCaseTest {

    @Test
    void should_create_a_mars() {
        MarsUseCase marsUseCase = new MarsUseCase(5, 5);

        List<Object> world = marsUseCase.getWorld();

        Assertions.assertEquals(world.size(), 25);
    }

    @Test
    void should_put_an_object_on_mars() {
        MarsUseCase marsUseCase = new MarsUseCase(5, 5);

        marsUseCase.putObject(2, 4, Object.ROVER);

        Assertions.assertEquals(marsUseCase.seeAtPosition(2, 4), Object.ROVER);
    }
}