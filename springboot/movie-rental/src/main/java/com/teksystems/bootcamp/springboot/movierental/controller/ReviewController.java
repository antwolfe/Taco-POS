package com.teksystems.bootcamp.springboot.movierental.controller;

import com.teksystems.bootcamp.springboot.movierental.model.Review;
import com.teksystems.bootcamp.springboot.movierental.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")

public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @GetMapping("/")
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @GetMapping("/{page}{limit}")
    public List<Review> getPaginatedReviews(@PathVariable int page,
                                            @PathVariable int limit){
        return reviewService.getPaginatedReviews(page, limit);
    }

    @GetMapping("/{id}")
    public Review getReview(@PathVariable Long id){
        return reviewService.getReview(id);
    }

    @PostMapping("/")
    public List<Review> createReview(@RequestBody List<Review> reviews) {
        return reviewService.createReview(reviews);
    }

    @PutMapping("/{id}")
    public Review updateReview(@PathVariable(name= "id") Long reviewId,
                               @RequestBody Review reviewDetails) {
        return reviewService.updateReview(reviewId, reviewDetails);
    }

    @DeleteMapping("/{reviewId}")
    public void deleteReview(@PathVariable Long reviewId){
        reviewService.deleteReview(reviewId);
    }

}
