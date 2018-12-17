package cc.oobootcamp.length;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LengthTest {

    @Test
    void should_return_0_when_compare_given_two_length_with_same_amount() {
        Length length1 = new Length(5);
        Length length2 = new Length(5);
        assertThat(length1.compare(length2)).isZero();
    }

    @Test
    void should_return_negative_when_compare_given_first_length_smaller_amount() {
        Length length1 = new Length(2);
        Length length2 = new Length(5);
        assertThat(length1.compare(length2)).isNegative();
    }

    @Test
    void should_return_positive_when_compare_given_second_length_smaller_amount() {
        Length length1 = new Length(7);
        Length length2 = new Length(5);
        assertThat(length1.compare(length2)).isPositive();
    }

}
