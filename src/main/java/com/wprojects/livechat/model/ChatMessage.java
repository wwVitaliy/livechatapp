package com.wprojects.livechat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a chat message
 */
@Data   // generates @Getter, @Setter, @RequiredArgsConstructor, @ToString, and @EqualsAndHashCode
@NoArgsConstructor
public class ChatMessage {
    private Long id;
    private String sender;
    private String content;
}
