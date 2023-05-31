package ChatTask;

import java.util.List;

public class ChatController {

    private final ChatService chatService;

    ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    public List<Message> getMessagesFromChat(long chatId, long from, long to) {
        return chatService.getMessagesFromChat(chatId, from, to);
    }

}
