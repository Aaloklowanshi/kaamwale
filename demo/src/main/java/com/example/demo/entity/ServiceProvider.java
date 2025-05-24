package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "service_providers")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ServiceProvider {
    @Id
    private String id;

    private String userId;
    private String profession;
    private String bio;
    private List<String> serviceTypes;

    private double averageRating;
    private double basePrice;

    private List<TimeSlot> availableSlots;

    private String imageUrl;
    private boolean isActive;
    private LocalDateTime createdAt;
}