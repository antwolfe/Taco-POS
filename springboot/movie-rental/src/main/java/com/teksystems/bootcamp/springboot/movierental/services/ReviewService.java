package com.teksystems.bootcamp.springboot.movierental.services;

import com.teksystems.bootcamp.springboot.movierental.model.Review;
import com.teksystems.bootcamp.springboot.movierental.repository.ReviewRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review updateReview(Long reviewId, Review reviewDetails) {
        Optional<Review> review = reviewRepository.findById(reviewId);
        if (review.isPresent()) {
            Review newReview = review.get();
            // review.setStarRating()
//            return review.save();
            return newReview;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No review exists with id: " + reviewId);
        }
        // review set ratingId, customerId, filmId
        ;
    }

    public void deleteReview(Long reviewId) {
        try {
            reviewRepository.deleteById(reviewId);
        } catch (EmptyResultDataAccessException exception){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No Review exists with that ID");
        }
    }

    public List<Review> getPaginatedReviews(int page, int limit){
        Pageable paging = PageRequest.of(page, limit);
        Page<Review> pagedResults = reviewRepository.findAll(paging);
        return pagedResults.toList();
    }

    public Review getReview(Long reviewId){
        Optional<Review> review = reviewRepository.findById(reviewId);
        if (review.isPresent()) {
            return review.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No review exists with id: " + reviewId);
        }
    }



}
