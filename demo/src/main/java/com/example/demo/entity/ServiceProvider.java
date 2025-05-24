package com.example.demo.entity;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "service_providers")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceProvider {
    @Id
    private String id;

    private String name;
    private String bio;
    private List<String> services;
    private double price;
    private double ratings;

    private String imageUrl;

    private List<TimeSlot> availableSlots;
}
