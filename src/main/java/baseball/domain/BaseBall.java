package baseball.domain;

import baseball.view.Input;
import baseball.view.Output;

public class BaseBall {

    public void start() {
        Output.printStartMessage();

        do {
            Balls randomBalls = new Balls();
            System.out.println(randomBalls.getBalls());
            play(randomBalls);
        } while (Input.isRestart());
    }

    private void play(Balls randomBalls) {
        while (true) {
            String userInput = Input.readNumber();
            Balls inputBalls = new Balls(userInput);

            int strikeCount = Counter.countStrike(inputBalls.getBalls(), randomBalls.getBalls());
            int ballCount = Counter.countBall(inputBalls.getBalls(), randomBalls.getBalls());

            if (strikeCount == 3) {
                Output.printStrikeCount(strikeCount);
                Output.printEndMessage();
                break;
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
