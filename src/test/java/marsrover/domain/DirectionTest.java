package marsrover.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

    @Test
    void should_get_s_from_value_0() {
        Assertions.assertEquals(Direction.VALUE.getDirectionFromValue(0), Direction.S);
    }

    @Test
    void should_get_e_from_value_1() {
        Assertions.assertEquals(Direction.VALUE.getDirectionFromValue(1), Direction.E);
    }

    @Test
    void should_get_n_from_value_2() {
        Assertions.assertEquals(Direction.VALUE.getDirectionFromValue(2), Direction.N);
    }

    @Test
    void should_get_w_from_value_3() {
        Assertions.assertEquals(Direction.VALUE.getDirectionFromValue(3), Direction.W);
    }

    @Test
    void should_get_value_from_value_4() {
        Assertions.assertEquals(Direction.VALUE.getDirectionFromValue(4), Direction.VALUE);
    }

    @Test
    void should_get_value_0_from_direction_s() {
        Assertions.assertEquals(Direction.S.getDirectionValue(), 0);
    }

    @Test
    void should_get_value_1_from_direction_e() {
        Assertions.assertEquals(Direction.E.getDirectionValue(), 1);
    }

    @Test
    void should_get_value_2_from_direction_n() {
        Assertions.assertEquals(Direction.N.getDirectionValue(), 2);
    }

    @Test
    void should_get_value_3_from_direction_w() {
        Assertions.assertEquals(Direction.W.getDirectionValue(), 3);
    }
}