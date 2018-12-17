package cc.oobootcamp.length;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LengthTest {

    @Test
    void should_return_0_when_compare_given_two_length_with_same_amount() {
        Length length1 = new Length(5, "cm");
        Length length2 = new Length(5, "cm");
        assertThat(length1.compare(length2)).isZero();
    }

    @Test
    void should_throw_exception_when_unit_is_not_same() {
        Length length1 = new Length(5, "km");
        Length length2 = new Length(5, "cm");
        assertThrows(IllegalStateException.class, () -> length1.compare(length2));
    }
}
