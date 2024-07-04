package baseball.view;

import static baseball.utils.Constants.BALL_MESSAGE;
import static baseball.utils.Constants.BLANK;
import static baseball.utils.Constants.END_MESSAGE;
import static baseball.utils.Constants.NOTHING_MESSAGE;
import static baseball.utils.Constants.START_MESSAGE;
import static baseball.utils.Constants.STRIKE_MESSAGE;

public class Output {


    public static void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void printEndMessage() {
        System.out.println(END_MESSAGE);
    }

    public static void printNothingMessage() {
        System.out.println(NOTHING_MESSAGE);
    }

    public static void printBallCount(int ballCount) {
        System.out.println(ballCount + BALL_MESSAGE);
    }

    public static void printStrikeCount(int strikeCount) {
        System.out.println(strikeCount + STRIKE_MESSAGE);
    }

    public static void printBallAndStrikeCount(int ballCount, int strikeCount) {
        System.out.println(ballCount + BALL_MESSAGE + BLANK + strikeCount + STRIKE_MESSAGE);
    }
}
