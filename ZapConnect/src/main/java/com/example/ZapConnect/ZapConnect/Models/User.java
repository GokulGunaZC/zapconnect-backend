package com.example.ZapConnect.ZapConnect.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    private Double latitude;
    private Double longitude;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // 1 USER → MANY POSTS
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> posts;

    // 1 USER → MANY RESPONSES
    @OneToMany(mappedBy = "responder")
    private List<Response> responses;

    // 1 USER → MANY MESSAGES (sender)
    @OneToMany(mappedBy = "sender")
    private List<Message> sentMessages;
}