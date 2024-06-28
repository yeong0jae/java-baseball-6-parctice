package baseball;

import camp.nextstep.edu.missionutils.Console;

public class BaseBall {

    public void start() {

        RandomBall randomBall = new RandomBall();
        String randomNumber = randomBall.generate();

        System.out.println(randomNumber);

        BaseBall baseBall = new BaseBall();
        baseBall.play(randomNumber);

        while (true) {
            Output.printRestartMessage();
            String restartInput = Console.readLine();
            if (restartInput.equals("1")) {
                randomNumber = randomBall.generate();
                System.out.println(randomNumber);

                baseBall.play(randomNumber);

            } else if (restartInput.equals("2")) {
                break;
            }
        }
    }

    private void play(String randomNumber) {
        while (true) {

            Input input = new Input();
            String userInput = input.readNumber();

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
