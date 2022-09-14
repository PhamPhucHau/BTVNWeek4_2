package com.example.WebSocket.Model;

import lombok.Data;

import java.awt.*;
@Data
public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;
    public enum MessageType{
        CHAT,
        JOIN,
        LEAVE
    }
}
