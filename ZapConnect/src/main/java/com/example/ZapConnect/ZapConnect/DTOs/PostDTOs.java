package com.example.ZapConnect.ZapConnect.DTOs;

import lombok.Data;

import java.util.List;

@Data
public class PostDTOs {
    private Long id;
    private String title;
    private String description;
    private Long userId;
    private List<Long> tagIds;
}