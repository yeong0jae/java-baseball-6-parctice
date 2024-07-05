package baseball.domain;

import java.util.List;

public class Counter {

    public static int countStrike(List<Integer> inputBalls, List<Integer> randomBalls) {
        int strikeCount = 0;
        for (int i = 0; i < 3; i++) {
            if (inputBalls.get(i).equals(randomBalls.get(i))) {
                strikeCount += 1;
            }
        }
        return strikeCount;
    }

    public static int countBall(List<Integer> inputBalls, List<Integer> randomBalls) {
        int ballCount = 0;
        if (inputBalls.get(0).equals(randomBalls.get(1)) || inputBalls.get(0).equals(randomBalls.get(2))) {
            ballCount += 1;
        }
        if (inputBalls.get(1).equals(randomBalls.get(0)) || inputBalls.get(1).equals(randomBalls.get(2))) {
            ballCount += 1;
        }
        if (inputBalls.get(2).equals(randomBalls.get(0)) || inputBalls.get(2).equals(randomBalls.get(1))) {
            ballCount += 1;
        }
        return ballCount;
    }
}
