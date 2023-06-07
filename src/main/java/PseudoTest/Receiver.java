package PseudoTest;

public class Receiver {

    private int content;

    public int getContent() {
        return content;
    }

    public void receive(int content) {
        this.content = content;
    }
}
