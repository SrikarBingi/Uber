package com.example.uberreviewservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "driver_review")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverReview extends Review {

    private Long driverId;
    private Long passengerId; // who wrote the review
    private String driverReviewContent;
}