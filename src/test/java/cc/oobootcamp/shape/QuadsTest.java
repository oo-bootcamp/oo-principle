package cc.oobootcamp.shape;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class QuadsTest {
    @Test
    void should_return_rectangle_area_when_calculate_given_width_and_height_valid() {
        Quads quads = new Rectangle();
        quads.setHeight(3);
        quads.setWidth(5);

        assertThat(quads.calculateArea()).isEqualTo(15);
    }
    @Test
    void should_return_square_area_when_calculate_given_width_and_height_valid() {
        Quads quads = new Square();
        quads.setWidth(5);
        assertThat(quads.calculateArea()).isEqualTo(25);
    }
}