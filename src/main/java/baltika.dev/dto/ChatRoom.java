package baltika.dev.dto;


import lombok.Data;

@Data
public class ChatRoom {
    private String chatId;
    private String senderId;
    private String recipientId;
}