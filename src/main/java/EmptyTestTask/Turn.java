package EmptyTestTask;

import java.util.ArrayList;

public abstract class Turn {
    public final ArrayList<Dice> dice = new ArrayList<>();

    public void roll() {
        if (dice.isEmpty()) {
            while (dice.size() < 6) {
                dice.add(new Dice());
            }
        }
        for (Dice d : dice) {
            if (d.getValue() != DiceValue.REMOVED) {
                d.roll();
            }
        }
    }

    public void resetDice() {
        for (Dice d : dice) {
            d.reset();
        }
    }

    public abstract int startTurn(Player player);
}
