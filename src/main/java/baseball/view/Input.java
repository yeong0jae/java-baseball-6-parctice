package baseball.view;

import static baseball.utils.Constants.NUMBER_INPUT_MESSAGE;
import static baseball.utils.Constants.NUMBER_LENGTH;
import static baseball.utils.Constants.RESTART_INPUT_MESSAGE;

import camp.nextstep.edu.missionutils.Console;

public class Input {


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
