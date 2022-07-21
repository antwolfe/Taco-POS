package com.teksystems.bootcamp.springboot.movierental.services;

import com.teksystems.bootcamp.springboot.movierental.model.Rating;
import com.teksystems.bootcamp.springboot.movierental.model.Review;
import com.teksystems.bootcamp.springboot.movierental.repository.CustomerRepository;
import com.teksystems.bootcamp.springboot.movierental.repository.FilmRepository;
import com.teksystems.bootcamp.springboot.movierental.repository.RatingRepository;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private RatingRepository ratingRepository;
    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private CustomerRepository customerRepository;
    //pull in film, rating, customer repos. find matching


    // CREATE
    public List<Review> createReview(List<Review> reviews) {
        return reviewRepository.saveAll(reviews);
    }

    // READ
    public List<Review> getReviews(Integer page, Integer limit) {
        if (page == null){ page = 0; }
        if (limit == null){ limit = 5; }
        Pageable paging = PageRequest.of(page, limit);
        Page<Review> pagedResults = reviewRepository.findAll(paging);
        return pagedResults.toList();
    }

    public Review getReview(short reviewId){
        Optional<Review> review = reviewRepository.findById(reviewId);
        if (review.isPresent()) {
            return review.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No review exists with id: " + reviewId);
        }
    }


    // UPDATE
    public Review updateReview(short reviewId, Review reviewDetails) {
        Optional<Review> review = reviewRepository.findById(reviewId);
        if (review.isPresent()) {
            Review newReview = review.get();
            newReview.setCustomer(customerRepository.findById(reviewDetails.getCustomer()).get());
            newReview.setFilm(filmRepository.findById(reviewDetails.getFilm()).get());
            newReview.setRating(ratingRepository.findById(reviewDetails.getRating()).get());
            return reviewRepository.save(newReview);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No review exists with id: " + reviewId);
        }
    }


    // DELETE
    public void deleteReview(short reviewId) {
        try {
            reviewRepository.deleteById(reviewId);
        } catch (EmptyResultDataAccessException exception){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No Review exists with that ID");
        }
    }

}
