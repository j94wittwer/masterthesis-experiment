package EmptyTestTask;

import java.security.InvalidParameterException;
import java.util.Random;

public enum DiceValue {
    UNROLLED,
    REMOVED,
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX;

    public static DiceValue getRandomRollValue() {
        Random random = new Random();
        DiceValue roll = null;
        while (roll == null) {
            roll = values()[random.nextInt(values().length)];
            if (roll == DiceValue.UNROLLED || roll == DiceValue.REMOVED) {
                roll = null;
            }
        }
        return roll;
    }

    public static int diceValueToInt(DiceValue value) {
        if (value == DiceValue.ONE) {
            return 1;
        }
        if (value == DiceValue.TWO) {
            return 2;
        }
        if (value == DiceValue.THREE) {
            return 3;
        }
        if (value == DiceValue.FOUR) {
            return 4;
        }
        if (value == DiceValue.FIVE) {
            return 5;
        }
        if (value == DiceValue.SIX) {
            return 6;
        }
        throw new InvalidParameterException();
    }
}
