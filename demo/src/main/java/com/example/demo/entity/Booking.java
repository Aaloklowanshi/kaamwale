package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collection = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Booking {
    @Id
    private String id;

    private String userId;
    private String providerId;
    private String serviceType;
    private LocalDateTime bookingTime;
    private LocalDate serviceDate;
    private TimeSlot timeSlot;

    private String address;
    private String status;
    private String userNotes;

    private double agreedPrice;
    private LocalDateTime updatedAt;
}
