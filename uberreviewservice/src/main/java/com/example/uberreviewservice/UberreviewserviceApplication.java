package com.example.uberreviewservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.uberreviewservice.Service.ReviewService;
import com.example.uberreviewservice.models.Review;

@EnableJpaAuditing
@SpringBootApplication
public class UberreviewserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberreviewserviceApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ReviewService reviewService){
		return args->{
			Review review = reviewService.createReview();
			System.out.println(review);
		};
	}
}
