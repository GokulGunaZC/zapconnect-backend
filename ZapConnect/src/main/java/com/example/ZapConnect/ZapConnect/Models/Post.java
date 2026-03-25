package com.example.ZapConnect.ZapConnect.Models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "posts")
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    private Integer tag;
    private Integer maxMembers;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // MANY POSTS → 1 USER
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // MANY-MANY (POST ↔ TAG)
    @ManyToMany
    @JoinTable(
            name = "post_tags",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags;

    // 1 POST → MANY RESPONSES
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Response> responses;

}
