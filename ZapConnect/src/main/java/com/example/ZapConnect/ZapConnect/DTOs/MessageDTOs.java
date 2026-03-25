package com.example.ZapConnect.ZapConnect.DTOs;

import lombok.Data;

@Data
public class MessageDTOs {
    private Long senderId;
    private Long receiverId;
    private String message;
}