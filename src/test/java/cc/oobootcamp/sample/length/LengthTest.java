package cc.oobootcamp.sample.length;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LengthTest {
    @Test
    void should_return_0_when_compare_given_two_length_with_same_amount_and_same_unit() {
        Length length1 = new Length(5, Unit.CM);
        Length length2 = new Length(5, Unit.CM);
        assertThat(length1.compareTo(length2)).isZero();
    }

    @Test
    void should_return_0_when_compare_given_two_length_with_diff_amount_and_diff_unit() {
        Length length1 = new Length(5, Unit.M);
        Length length2 = new Length(500, Unit.CM);
        assertThat(length1.compareTo(length2)).isZero();
    }
}
