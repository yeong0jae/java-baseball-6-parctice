package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

public class NumberGeneratorImpl implements NumberGenerator {
    @Override
    public int pickNumberInRange(int min, int max) {
        return Randoms.pickNumberInRange(min, max);
    }
}
