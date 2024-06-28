package baseball;

public class Output {
    public void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printRestartMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void printEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printNothingMessage() {
        System.out.println("낫싱");
    }

    public void printBallCount(int ballCount) {
        System.out.println(ballCount + "볼");
    }

    public void printStrikeCount(int strikeCount) {
        System.out.println(strikeCount + "스트라이크");
    }

    public void printBallAndStrikeCount(int ballCount, int strikeCount) {
        System.out.println(ballCount + "볼" + " " + strikeCount + "스트라이크");
    }
}
