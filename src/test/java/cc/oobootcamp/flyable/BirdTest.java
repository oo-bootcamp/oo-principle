package cc.oobootcamp.flyable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BirdTest {
    @Test
    void should_bird_z_index_plus_1_meter_when_fly() {
        Flyable bird = new Bird(0, 0, 0);
        double originZ = bird.reportZ();
        double originY = bird.reportY();
        double originX  = bird.reportX();

        bird.fly();
        
        assertThat(bird.reportZ()).isEqualTo(originZ + 1);
        assertThat(bird.reportY()).isEqualTo(originY);
        assertThat(bird.reportX()).isEqualTo(originX);
    }

    @Test
    void should_penguin_x_index_plus_1_meter_when_fly() {
        Flyable penguin = new Penguin(0, 0);
        double originX = penguin.reportX();
        double originY = penguin.reportY();
        penguin.fly();
        assertThat(penguin.reportX()).isEqualTo(originX + 1);
        assertThat(penguin.reportY()).isEqualTo(originY);
        assertThat(penguin.reportZ()).isEqualTo(0);
    }
}
