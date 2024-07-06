package baseball.model;

import static baseball.utils.Constants.NUMBER_LENGTH;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Balls {

    private final List<Integer> balls;

    public Balls() {
        List<Integer> balls = new ArrayList<>();
        while (balls.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!balls.contains(randomNumber)) {
                balls.add(randomNumber);
            }
        }
        this.balls = balls;
    }

    public Balls(String inputBalls) {
        validateSize(inputBalls);
        validateNumeric(inputBalls);
        validateDuplicate(inputBalls);
        List<Integer> balls = new ArrayList<>();
        for (int i = 0; i < NUMBER_LENGTH; i++) {
            int inputBall = inputBalls.charAt(i) - '0';
            balls.add(inputBall);
        }
        this.balls = balls;
    }

    public List<Integer> getBalls() {
        return balls;
    }

    private void validateSize(String inputBalls) {
        if (inputBalls.length() != NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    private void validateNumeric(String inputBalls) {
        for (char inputBall : inputBalls.toCharArray()) {
            if (!Character.isDigit(inputBall)) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void validateDuplicate(String inputBalls) {
        if (inputBalls.charAt(0) == inputBalls.charAt(1)) {
            throw new IllegalArgumentException();
        }
        if (inputBalls.charAt(0) == inputBalls.charAt(2)) {
            throw new IllegalArgumentException();
        }
        if (inputBalls.charAt(1) == inputBalls.charAt(2)) {
            throw new IllegalArgumentException();
        }
    }

}
