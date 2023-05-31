package ChatTask;

import java.util.HashSet;
import java.util.Set;

public class ChatRepository {

    private final Set<Chat> chats;

    public ChatRepository() {
        this.chats = new HashSet<>();
    }

    public void addChat(Chat chat) {
        this.chats.add(chat);
    }

    public Chat getChatById(long chatId){
        for (Chat chat : chats) {
            if (chat.getId() == chatId) {
                return chat;
            }
        }
        return null;
    }

}
