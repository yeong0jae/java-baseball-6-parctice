package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        System.out.println("숫자 야구 게임을 시작합니다.");

        String computerString = randomNumber();
        System.out.println(computerString);

        baseball(computerString);

        while (true) {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String restartInput = Console.readLine();
            if (restartInput.equals("1")) {
                computerString = randomNumber();
                System.out.println(computerString);

                baseball(computerString);

            } else if (restartInput.equals("2")) {
                System.out.println("게임 종료");
                break;
            }
        }
    }

    private static String randomNumber() {
        // 컴퓨터가 세자리 수 선택
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int number : computer) {
            sb.append(number);
        }
        return sb.toString();
    }

    private static void baseball(String computerString) {
        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            String input = Console.readLine();
            if (input.equals(computerString)) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                break;
            }
            int ballCount = 0;
            int strikeCount = 0;
            // 첫 번째 수 스트라이크, 볼 판단
            if (input.charAt(0) == computerString.charAt(0)) {
                strikeCount += 1;
            }
            if (input.charAt(0) == computerString.charAt(1) || input.charAt(0) == computerString.charAt(2)) {
                ballCount += 1;
            }
            // 두 번째 수 스트라이크, 볼 판단
            if (input.charAt(1) == computerString.charAt(1)) {
                strikeCount += 1;
            }
            if (input.charAt(1) == computerString.charAt(0) || input.charAt(1) == computerString.charAt(2)) {
                ballCount += 1;
            }
            // 세 번째 수 스트라이크, 볼 판단
            if (input.charAt(2) == computerString.charAt(2)) {
                strikeCount += 1;
            }
            if (input.charAt(2) == computerString.charAt(0) || input.charAt(2) == computerString.charAt(1)) {
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
