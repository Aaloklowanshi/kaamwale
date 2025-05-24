package com.example.demo.entity;

import com.example.demo.enums.UserRole;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "users")
@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class User {
    @Id
    private String id;

    private String name;
    private String email;
    private String phone;
    private String password;
    private UserRole role;

    private LocalDateTime createdAt;
    private boolean isVerified;
}
