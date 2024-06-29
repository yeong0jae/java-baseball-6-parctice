package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    public static String readBallNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String userInput = Console.readLine();
        validateBallNumber(userInput);
        return userInput;
    }

    private static void validateBallNumber(String userInput) {
        if (userInput.length() != 3) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean isRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String userInput = Console.readLine();
        return userInput.equals("1");
    }
}
