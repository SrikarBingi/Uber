package com.example.uberreviewservice.Service;

import org.springframework.stereotype.Service;

import com.example.uberreviewservice.Repository.ReviewRepository;
import com.example.uberreviewservice.models.Review;

@Service
public class ReviewService{

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review createReview() {
        Review review = Review
                            .builder()
                            .content("good ride")
                            .rating(5.0)
                            .build();
        return reviewRepository.save(review);
    }
    
    

}
