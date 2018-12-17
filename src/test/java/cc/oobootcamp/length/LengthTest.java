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

}
