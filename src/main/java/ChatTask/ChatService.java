package ChatTask;

import java.util.List;

public class ChatService {

    private final ChatRepository chatRepository;

    public ChatService (ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public List<Message> getMessagesFromChat(long chatId, long from, long to) {
        Chat chat = chatRepository.getChatById(chatId);
        if (chat == null) {
            throw new RuntimeException("Chat does not exist");
        }
        return chat.getMessages(from, to);
    }
}
