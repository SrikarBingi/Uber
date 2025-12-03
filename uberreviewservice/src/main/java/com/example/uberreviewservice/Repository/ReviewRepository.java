package com.example.uberreviewservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.uberreviewservice.models.Review;

public interface ReviewRepository extends JpaRepository<Review,Long>{
}
