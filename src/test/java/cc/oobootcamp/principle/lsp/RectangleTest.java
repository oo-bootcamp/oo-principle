package cc.oobootcamp.principle.lsp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RectangleTest {
    @Test
    void should_return_rectangle_area_when_calculate_given_width_and_height_valid() {
        Rectangle quads = new Rectangle();
        quads.setHeight(3);
        quads.setWidth(5);

        assertThat(quads.calculateArea()).isEqualTo(15);
    }

    @Test
    void should_return_square_area_when_calculate_given_width_and_height_valid() {
        Rectangle quads = new Square();
        quads.setHeight(3);
        quads.setWidth(5);
        assertThat(quads.calculateArea()).isEqualTo(25);
    }
}