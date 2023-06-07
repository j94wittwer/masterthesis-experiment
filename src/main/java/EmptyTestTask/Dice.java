package EmptyTestTask;

public class Dice {
    private DiceValue value = DiceValue.UNROLLED;

    public void roll() {
        value = DiceValue.getRandomRollValue();
    }

    public void reset() {
        value = DiceValue.UNROLLED;
    }

    public void remove() {
        value = DiceValue.REMOVED;
    }

    public DiceValue getValue() {
        return value;
    }

}