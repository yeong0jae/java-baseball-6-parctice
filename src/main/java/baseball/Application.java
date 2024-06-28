package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {

        Output output = new Output();
        output.printStartMessage();

        RandomBall randomBall = new RandomBall();
        String randomNumber = randomBall.generate();

        System.out.println(randomNumber);

        baseball(randomNumber);

        while (true) {
            output.printRestartMessage();
            String restartInput = Console.readLine();
            if (restartInput.equals("1")) {
                randomNumber = randomBall.generate();
                System.out.println(randomNumber);

                baseball(randomNumber);

            } else if (restartInput.equals("2")) {
                output.printEndMessage();
                break;
            }
        }
    }

    private static void baseball(String randomNumber) {
        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            String userInput = Console.readLine();
            if (userInput.equals(randomNumber)) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
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
                System.out.println("낫싱");
            } else if (strikeCount == 0) {
                System.out.println(ballCount + "볼");
            } else if (ballCount == 0) {
                System.out.println(strikeCount + "스트라이크");
            } else {
                System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");
            }
        }
    }


}
