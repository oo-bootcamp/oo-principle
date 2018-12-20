package cc.oobootcamp.flyable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BirdTest {
    @Test
    void should_bird_z_index_plus_1_meter_when_fly() {
        Bird bird = new Bird(0, 0, 0);
        double originZ = bird.getZ();
        bird.fly();
        assertThat(bird.getZ()).isEqualTo(originZ + 1);
    }

    @Test
    void should_penguin_x_index_plus_1_meter_when_fly() {
        Bird bird = new Penguin(0, 0, 0);
        double originX = bird.getX();
        bird.fly();
        assertThat(bird.getX()).isEqualTo(originX + 1);
    }
}
