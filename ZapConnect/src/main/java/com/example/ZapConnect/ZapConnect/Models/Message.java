package com.example.ZapConnect.ZapConnect.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // MANY → 1 USER (sender)
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    // MANY → 1 USER (receiver)
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;
}
