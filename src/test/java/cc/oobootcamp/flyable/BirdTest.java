package cc.oobootcamp.flyable;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BirdTest {
    @Test
    void should_bird_height_plus_1_meter_when_fly(){
        Bird bird = new Bird();
        double originHeight = bird.getHeight();
        bird.fly();
        assertThat(bird.getHeight()).isEqualTo(originHeight + 1);
    }
}
