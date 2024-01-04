package baltika.dev.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ChatMessage {
    private String chatId;
    private String senderId;
    private String recipientId;
    private String senderName;
    private String recipientName;
    private String content;
    private Date timestamp;
    private MessageStatus status;
}