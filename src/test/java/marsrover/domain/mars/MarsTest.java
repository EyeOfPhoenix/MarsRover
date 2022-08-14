package marsrover.domain.mars;

import marsrover.domain.Object;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsTest {

    @Test
    void should_set_the_size() {
        Mars mars = new Mars(5, 5);

        Assertions.assertEquals(mars.getWorld().size(), 25);
    }

    @Test
    void should_put_rover_upper_right_with_wrapping_at_edges() {
        Mars mars = new Mars(5, 5);

        mars.putObject(-1, -1, Object.ROVER);

        Assertions.assertEquals(mars.getWorld().get(24), Object.ROVER);
    }

    @Test
    void should_put_rover_bottom_left_with_wrapping_at_edges() {
        Mars mars = new Mars(5, 5);

        mars.putObject(5, 5, Object.ROVER);

        Assertions.assertEquals(mars.getWorld().get(0), Object.ROVER);
    }

    @Test
    void should_put_rover_upper_left_with_wrapping_at_edges() {
        Mars mars = new Mars(5, 5);

        mars.putObject(0, -1, Object.ROVER);

        Assertions.assertEquals(mars.getWorld().get(20), Object.ROVER);
    }

    @Test
    void should_put_rover_bottom_right_with_wrapping_at_edges() {
        Mars mars = new Mars(5, 5);

        mars.putObject(-1, 0, Object.ROVER);

        Assertions.assertEquals(mars.getWorld().get(4), Object.ROVER);
    }

    @Test
    void should_see_an_obstacle_at_a_position() {
        Mars mars = new Mars(5, 5);

        mars.putObject(0, 2, Object.OBSTACLE);

        Assertions.assertEquals(mars.seeAtPosition(0, 2), Object.OBSTACLE);
    }
}