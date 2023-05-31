package ChatTask;

public class Message {

    private final long id;
    private final String content;
    private final long fromUserId;
    private final long toUserId;


    public Message(long id, String content, long fromUserId, long toUserId) {
        this.id = id;
        this.content = content;
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public long getFromUserId() {
        return fromUserId;
    }

    public long getToUserId() {
        return toUserId;
    }
}
