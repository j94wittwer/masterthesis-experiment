package ChatTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chat {

    private final List<Message> messages;
    private final long id;

    public Chat() {
        this.messages = new ArrayList<>();
        this.id = new Random().nextLong();
    }

    /**
     * Takes a message and pushes it to the head of the message list
     * @param message: Message
     */
    public void pushMessage(Message message) {
        messages.add(0, message);
    }

    public List<Message> getMessages() {
        return this.messages;
    }

    public long getId() {
        return this.id;
    }
}
