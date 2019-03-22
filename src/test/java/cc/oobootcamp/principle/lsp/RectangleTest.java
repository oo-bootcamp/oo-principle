package cc.oobootcamp.principle.lsp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {
    @Test
    void should_return_30_when_calculate_area_given_width_3_and_height_10() {
        // Given
        double width = 3;
        double height = 10;
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(height);
        rectangle.setWidth(width);

        // When
        double result = rectangle.calculateArea();

        // Then
        assertThat(result).isEqualTo(30);
    }

    @Test
    void should_return_exception_when_calculate_area_given_negative_value() {
        //Given
        double width = -1;
        double height = 32;

        Rectangle rectangle = new Rectangle();

        rectangle.setWidth(width);
        rectangle.setHeight(height);

        //When

        //Then
        assertThrows(IllegalArgumentException.class, () -> rectangle.calculateArea());
    }

}