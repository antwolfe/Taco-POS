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

    // CREATE
    @PostMapping("/")
    public List<Review> createReview(@RequestBody List<Review> reviews) {
        return reviewService.createReview(reviews);
    }


    // READ
    @GetMapping("/")
    public List<Review> getReviews(@RequestParam(required = false) Integer page,
                                      @RequestParam(required = false) Integer limit) {
        return reviewService.getReviews(page, limit);
    }

    @GetMapping("/{id}")
    public Review getReview(@PathVariable short id){
        return reviewService.getReview(id);
    }


    // UPDATE
    @PutMapping("/{id}")
    public Review updateReview(@PathVariable(name= "id") short reviewId,
                               @RequestBody Review reviewDetails) {
        return reviewService.updateReview(reviewId, reviewDetails);
    }

    // DELETE
    @DeleteMapping("/{reviewId}")
    public void deleteReview(@PathVariable short reviewId){
        reviewService.deleteReview(reviewId);
    }

}
