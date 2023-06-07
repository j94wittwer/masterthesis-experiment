package PseudoTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestExampleBroadcast {

    @Test
    public void testBroadcast() {
        Receiver one = new Receiver();
        Receiver two = new Receiver();
        ExampleBroadCast emitter = new ExampleBroadCast(one, two);
        emitter.emit(5);
        assertEquals(one.getContent(), two.getContent());
    }

}
