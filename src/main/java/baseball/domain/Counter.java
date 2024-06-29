package baseball.domain;

public class Counter {

    public static int countStrike(String userInput, String randomNumber) {
        int strikeCount = 0;
        for (int i = 0; i < 3; i++) {
            if (userInput.charAt(i) == randomNumber.charAt(i)) {
                strikeCount += 1;
            }
        }
        return strikeCount;
    }

    public static int countBall(String userInput, String randomNumber) {
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
