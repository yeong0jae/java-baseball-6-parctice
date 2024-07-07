package baseball.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallsTest {

    @Test
    @DisplayName("야구 게임의 랜덤 숫자가 올바르게 생성되는지 검사한다.")
    void randomBallsTest() {
        //given
        NumberGenerator numberGenerator = new NumberGenerator() {
            private int callCount = 0;

            @Override
            public int pickNumberInRange(int min, int max) {
                callCount++;
                return callCount; // 1, 2, 3 반환
            }
        };

        //when
        Balls balls = new Balls(numberGenerator);

        //then
        assertThat(balls.getBalls().get(0)).isEqualTo(1);
        assertThat(balls.getBalls().get(1)).isEqualTo(2);
        assertThat(balls.getBalls().get(2)).isEqualTo(3);
    }

    @Test
    @DisplayName("유저가 입력한 야구 게임의 숫자가 올바르게 생성되는지 검사한다.")
    void inputBallsTest() {
        //given
        String inputBalls = "123";

        //when
        Balls balls = new Balls(inputBalls);

        //then
        assertThat(balls.getBalls().get(0)).isEqualTo(1);
        assertThat(balls.getBalls().get(1)).isEqualTo(2);
        assertThat(balls.getBalls().get(2)).isEqualTo(3);
    }
}
