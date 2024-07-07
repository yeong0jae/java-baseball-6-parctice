package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CounterTest {

    @Test
    @DisplayName("스트라이크 개수가 알맞게 세어지는지 검사한다.")
    void countStrikeTest() {
        //given
        List<Integer> inputBalls = new ArrayList<>();
        inputBalls.add(1);
        inputBalls.add(2);
        inputBalls.add(3);
        List<Integer> randomBalls = new ArrayList<>();
        randomBalls.add(2);
        randomBalls.add(1);
        randomBalls.add(3);

        //when
        int strikeCount = Counter.countStrike(inputBalls, randomBalls);

        //then
        assertThat(strikeCount).isEqualTo(1);
    }

    @Test
    @DisplayName("볼 개수가 알맞게 세어지는지 검사한다.")
    void countBallTest() {
        //given
        List<Integer> inputBalls = new ArrayList<>();
        inputBalls.add(1);
        inputBalls.add(2);
        inputBalls.add(3);
        List<Integer> randomBalls = new ArrayList<>();
        randomBalls.add(2);
        randomBalls.add(1);
        randomBalls.add(3);

        //when
        int ballCount = Counter.countBall(inputBalls, randomBalls);

        //then
        assertThat(ballCount).isEqualTo(2);
    }
}
