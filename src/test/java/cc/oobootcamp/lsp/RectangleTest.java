package cc.oobootcamp.lsp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {

    private static Stream<Arguments> widthHeightPair() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(2, 4),
                Arguments.of(4, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("widthHeightPair")
    void should_return_area_when_calculate_given_width_height_valid(int width, int height) {
        Rectangle rectangle = new Rectangle(width, height);
        assertThat(rectangle.calculateArea()).isEqualTo(width * height);
    }

    @Test
    void should_throw_exception_when_construct_given_width_height_invalid() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, -1));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 0));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, -5));
    }
}
