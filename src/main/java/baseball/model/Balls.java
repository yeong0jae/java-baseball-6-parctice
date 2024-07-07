package baseball.model;

import static baseball.utils.Constants.NUMBER_LENGTH;

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
            throw new IllegalArgumentException();
        }
    }

    private void isLengthThree(String inputBalls) {
        if (inputBalls.length() != NUMBER_LENGTH) {
            throw new IllegalArgumentException("입력한 값의 길이가 3이 아닙니다.");
        }
    }

    private void isNumeric(String inputBalls) {
        for (char inputBall : inputBalls.toCharArray()) {
            if (!Character.isDigit(inputBall)) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void hasDuplicates(String inputBalls) {
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
