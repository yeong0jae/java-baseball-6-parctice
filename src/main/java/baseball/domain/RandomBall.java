package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomBall {

    public String generate() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return listToString(computer);
    }

    private String listToString(List<Integer> computer) {
        StringBuilder sb = new StringBuilder();
        for (int number : computer) {
            sb.append(number);
        }
        return sb.toString();
    }

}
