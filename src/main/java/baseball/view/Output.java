package baseball.view;

public class Output {

    public static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    public static final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    public static final String NOTHING_MESSAGE = "낫싱";
    public static final String BALL_MESSAGE = "볼";
    public static final String STRIKE_MESSAGE = "스트라이크";
    public static final String BLANK = " ";

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
