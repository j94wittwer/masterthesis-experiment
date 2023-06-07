package PseudoTest;

public class ExampleBroadCast {
    private Receiver one, two;

    public ExampleBroadCast(Receiver one, Receiver two) {
        this.one = one;
        this.two = two;
    }

    public void emit(int value) {
        one.receive(value);
        two.receive(value);
    }
}
