package com.example.ZapConnect.ZapConnect.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "responses")
@Getter
@Setter
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // MANY RESPONSES → 1 POST
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    // MANY RESPONSES → 1 USER
    @ManyToOne
    @JoinColumn(name = "responder_id")
    private User responder;
}
