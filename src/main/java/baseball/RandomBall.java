package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomBall {
    private String randomNumber;

    public void generate() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        this.randomNumber = listToString(computer);
    }

    private String listToString(List<Integer> computer) {
        StringBuilder sb = new StringBuilder();
        for (int number : computer) {
            sb.append(number);
        }
        return sb.toString();
    }

    public String getRandomNumber() {
        return randomNumber;
    }
}
