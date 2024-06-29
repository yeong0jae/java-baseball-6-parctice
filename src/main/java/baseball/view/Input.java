package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    public static final int NUMBER_LENGTH = 3;
    public static final String NUMBER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    public static final String RESTART_INPUT_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static String readNumber() {
        System.out.print(NUMBER_INPUT_MESSAGE);
        String userInput = Console.readLine();
        validateBallNumber(userInput);
        return userInput;
    }

    private static void validateBallNumber(String userInput) {
        if (userInput.length() != NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean isRestart() {
        System.out.println(RESTART_INPUT_MESSAGE);
        String userInput = Console.readLine();
        return userInput.equals("1");
    }
}
