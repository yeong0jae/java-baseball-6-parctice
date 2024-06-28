package baseball;

public class BaseBall {

    public void start() {

        RandomBall randomBall = new RandomBall();
        String randomNumber;

        BaseBall baseBall = new BaseBall();

        do {
            randomBall.generate();
            randomNumber = randomBall.getRandomNumber();
            baseBall.play(randomNumber);
        } while (Input.isRestart());
    }

    private void play(String randomNumber) {
        while (true) {

            String userInput = Input.readBallNumber();

            if (userInput.equals(randomNumber)) {
                Output.printEndMessage();
                break;
            }
            int ballCount = 0;
            int strikeCount = 0;
            // 첫 번째 수 스트라이크, 볼 판단
            if (userInput.charAt(0) == randomNumber.charAt(0)) {
                strikeCount += 1;
            }
            if (userInput.charAt(0) == randomNumber.charAt(1) || userInput.charAt(0) == randomNumber.charAt(2)) {
                ballCount += 1;
            }
            // 두 번째 수 스트라이크, 볼 판단
            if (userInput.charAt(1) == randomNumber.charAt(1)) {
                strikeCount += 1;
            }
            if (userInput.charAt(1) == randomNumber.charAt(0) || userInput.charAt(1) == randomNumber.charAt(2)) {
                ballCount += 1;
            }
            // 세 번째 수 스트라이크, 볼 판단
            if (userInput.charAt(2) == randomNumber.charAt(2)) {
                strikeCount += 1;
            }
            if (userInput.charAt(2) == randomNumber.charAt(0) || userInput.charAt(2) == randomNumber.charAt(1)) {
                ballCount += 1;
            }
            // 스트라이크, 볼 출력
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
