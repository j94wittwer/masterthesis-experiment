package ChatTask;

import java.util.*;

public class Chat {

    private final List<Message> messages;
    private final long id;

    public Chat() {
        this.messages = new ArrayList<>();
        this.id = new Random().nextLong();
    }

    /**
     * Takes a message and pushes it to the head of the message list
     *
     * @param message: Message
     */
    public void pushMessage(Message message) {
        messages.add(0, message);
    }

    public List<Message> getMessages(long from, long to) {
        int size = messages.size();
        if (from > size) {
            return Collections.emptyList();
        }

        if (to > size) {
            to = size;
        }

        return messages.subList((int) from, (int) to);
    }

    public long getId() {
        return this.id;
    }
}
