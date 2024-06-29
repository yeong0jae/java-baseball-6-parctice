package baseball.domain;

import baseball.view.Input;
import baseball.view.Output;

public class BaseBall {

    public void start() {
        Output.printStartMessage();

        String randomNumber;

        do {
            randomNumber = RandomBall.generate();
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

            int strikeCount = Counter.countStrike(userInput, randomNumber);
            int ballCount = Counter.countBall(userInput, randomNumber);

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
