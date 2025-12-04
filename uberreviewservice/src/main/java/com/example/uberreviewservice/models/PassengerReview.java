package com.example.uberreviewservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "passenger_review")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PassengerReview extends Review {

    private Long passengerId; // who received the review
    private Long driverId;    // who wrote the review
    private String passengerReviewContent;
}
