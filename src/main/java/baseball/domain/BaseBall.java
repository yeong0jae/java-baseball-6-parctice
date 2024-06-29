package baseball.domain;

import baseball.view.Input;
import baseball.view.Output;

public class BaseBall {

    public void start() {
        Output.printStartMessage();

        RandomBall randomBall = new RandomBall();
        String randomNumber;

        do {
            randomNumber = randomBall.generate();
            play(randomNumber);
        } while (Input.isRestart());
    }

    private void play(String randomNumber) {
        while (true) {

            String userInput = Input.readNumber();

            if (userInput.equals(randomNumber)) {
                Output.printStrikeCount(3);
                Output.printEndMessage();
                break;
            }

            int strikeCount = countStrike(userInput, randomNumber);
            int ballCount = countBall(userInput, randomNumber);

            if (strikeCount == 0 && ballCount == 0) {
                Output.printNothingMessage();
            } else if (strikeCount == 0) {
                Output.printBallCount(ballCount);
            } else if (ballCount == 0) {
                Output.printStrikeCount(strikeCount);
            } else {
                Output.printBallAndStrikeCount(ballCount, strikeCount);
            }
        }
    }

    private int countStrike(String userInput, String randomNumber) {
        int strikeCount = 0;
        for (int i = 0; i < 3; i++) {
            if (userInput.charAt(i) == randomNumber.charAt(i)) {
                strikeCount += 1;
            }
        }
        return strikeCount;
    }

    private int countBall(String userInput, String randomNumber) {
        int ballCount = 0;
        if (userInput.charAt(0) == randomNumber.charAt(1) || userInput.charAt(0) == randomNumber.charAt(2)) {
            ballCount += 1;
        }
        if (userInput.charAt(1) == randomNumber.charAt(0) || userInput.charAt(1) == randomNumber.charAt(2)) {
            ballCount += 1;
        }
        if (userInput.charAt(2) == randomNumber.charAt(0) || userInput.charAt(2) == randomNumber.charAt(1)) {
            ballCount += 1;
        }
        return ballCount;
    }


}
