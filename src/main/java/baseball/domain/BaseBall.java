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

            int ballCount = 0;
            int strikeCount = 0;

            if (userInput.charAt(0) == randomNumber.charAt(0)) {
                strikeCount += 1;
            }
            if (userInput.charAt(0) == randomNumber.charAt(1) || userInput.charAt(0) == randomNumber.charAt(2)) {
                ballCount += 1;
            }

            if (userInput.charAt(1) == randomNumber.charAt(1)) {
                strikeCount += 1;
            }
            if (userInput.charAt(1) == randomNumber.charAt(0) || userInput.charAt(1) == randomNumber.charAt(2)) {
                ballCount += 1;
            }

            if (userInput.charAt(2) == randomNumber.charAt(2)) {
                strikeCount += 1;
            }
            if (userInput.charAt(2) == randomNumber.charAt(0) || userInput.charAt(2) == randomNumber.charAt(1)) {
                ballCount += 1;
            }

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


}
