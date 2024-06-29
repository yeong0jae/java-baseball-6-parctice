package baseball.domain;

import baseball.view.Input;
import baseball.view.Output;

public class BaseBall {

    private String randomNumber;

    public void start() {
        Output.printStartMessage();

        do {
            this.randomNumber = RandomBall.generate();
            play();
        } while (Input.isRestart());
    }

    private void play() {
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
