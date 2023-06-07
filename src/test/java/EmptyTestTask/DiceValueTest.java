package EmptyTestTask;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiceValueTest {

    DiceValue diceValue_One = DiceValue.ONE;
    DiceValue diceValue_Two = DiceValue.TWO;
    DiceValue diceValue_Three = DiceValue.THREE;
    DiceValue diceValue_Four = DiceValue.FOUR;
    DiceValue diceValue_Five = DiceValue.FIVE;
    DiceValue diceValue_Six = DiceValue.SIX;


    @Test
    void getRandomRollValue() {
        DiceValue diceValue = DiceValue.getRandomRollValue();
    }

    @Test
    void diceValueToInt() {
        assertEquals(1,DiceValue.diceValueToInt(diceValue_One));
        assertEquals(2,DiceValue.diceValueToInt(diceValue_Two));
        assertEquals(3,DiceValue.diceValueToInt(diceValue_Three));
        assertEquals(4,DiceValue.diceValueToInt(diceValue_Four));
        assertEquals(5,DiceValue.diceValueToInt(diceValue_Five));
        assertEquals(6,DiceValue.diceValueToInt(diceValue_Six));
    }

    @Test
    public void testDiceValueToInt_NotInt() {
        assertThrows(InvalidParameterException.class, () -> DiceValue.diceValueToInt(DiceValue.UNROLLED));
    }


}
