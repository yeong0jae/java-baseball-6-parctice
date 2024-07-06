package baseball.view;

import static baseball.utils.Constants.NUMBER_INPUT_MESSAGE;
import static baseball.utils.Constants.RESTART_INPUT_MESSAGE;

import camp.nextstep.edu.missionutils.Console;

public class Input {

    public static String readNumber() {
        System.out.print(NUMBER_INPUT_MESSAGE);
        return Console.readLine();
    }

    public static boolean isRestart() {
        System.out.println(RESTART_INPUT_MESSAGE);
        String userInput = Console.readLine();
        return userInput.equals("1");
    }
}
