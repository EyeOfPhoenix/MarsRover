package marsrover.domain.mars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsTest {

    @Test
    void should_set_the_size() {
        Mars mars = new Mars(5, 5);

        Assertions.assertEquals(mars.getWorld().size(), 100);
    }

    @Test
    void should_put_an_object_upper_right_with_wrapping_at_edges() {
        Mars mars = new Mars(5, 5);

        mars.putObject(-1, -1);

        Assertions.assertEquals(mars.getWorld().get(24), 1);
    }

    @Test
    void should_put_an_object_bottom_left_with_wrapping_at_edges() {
        Mars mars = new Mars(5, 5);

        mars.putObject(5, 5);

        Assertions.assertEquals(mars.getWorld().get(0), 1);
    }

    @Test
    void should_put_an_object_upper_left_with_wrapping_at_edges() {
        Mars mars = new Mars(5, 5);

        mars.putObject(0, -1);

        Assertions.assertEquals(mars.getWorld().get(20), 1);
    }

    @Test
    void should_put_an_object_bottom_right_with_wrapping_at_edges() {
        Mars mars = new Mars(5, 5);

        mars.putObject(-1, 0);

        Assertions.assertEquals(mars.getWorld().get(4), 1);
    }
}