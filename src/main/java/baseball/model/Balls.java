package baseball.model;

import static baseball.utils.Constants.NUMBER_LENGTH;
import static baseball.utils.ExceptionMessage.DUPLICATE_EXCEPTION_MESSAGE;
import static baseball.utils.ExceptionMessage.LENGTH_EXCEPTION_MESSAGE;
import static baseball.utils.ExceptionMessage.NULL_EXCEPTION_MESSAGE;
import static baseball.utils.ExceptionMessage.NUMERIC_EXCEPTION_MESSAGE;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private final List<Integer> balls;

    public Balls(NumberGenerator numberGenerator) {
        List<Integer> balls = new ArrayList<>();
        while (balls.size() < 3) {
            int randomNumber = numberGenerator.pickNumberInRange(1, 9);
            if (!balls.contains(randomNumber)) {
                balls.add(randomNumber);
            }
        }
        this.balls = balls;
    }

    public Balls(String inputBalls) {
        validateBalls(inputBalls);
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

    private void validateBalls(String inputBalls) {
        isNull(inputBalls);
        isLengthThree(inputBalls);
        isNumeric(inputBalls);
        hasDuplicates(inputBalls);
    }

    private void isNull(String inputBalls) {
        if (inputBalls == null) {
            throw new IllegalArgumentException(NULL_EXCEPTION_MESSAGE);
        }
    }

    private void isLengthThree(String inputBalls) {
        if (inputBalls.length() != NUMBER_LENGTH) {
            throw new IllegalArgumentException(LENGTH_EXCEPTION_MESSAGE);
        }
    }

    private void isNumeric(String inputBalls) {
        for (char inputBall : inputBalls.toCharArray()) {
            if (!Character.isDigit(inputBall)) {
                throw new IllegalArgumentException(NUMERIC_EXCEPTION_MESSAGE);
            }
        }
    }

    private void hasDuplicates(String inputBalls) {
        if (inputBalls.charAt(0) == inputBalls.charAt(1)
                || inputBalls.charAt(0) == inputBalls.charAt(2)
                || inputBalls.charAt(1) == inputBalls.charAt(2)
        ) {
            throw new IllegalArgumentException(DUPLICATE_EXCEPTION_MESSAGE);
        }
    }
}
