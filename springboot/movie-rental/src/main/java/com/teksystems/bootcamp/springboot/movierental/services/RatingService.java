package com.teksystems.bootcamp.springboot.movierental.services;

import com.teksystems.bootcamp.springboot.movierental.model.Rating;
import com.teksystems.bootcamp.springboot.movierental.repository.RatingRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    // CREATE
    public List<Rating> createRating(List<Rating> ratings) {
        return ratingRepository.saveAll(ratings);
    }

    // READ
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    // UPDATE
    public Rating updateRating(Long ratingId, Rating ratingDetails) {
        Optional<Rating> rating = ratingRepository.findById(ratingId);
        if (rating.isPresent()) {
            Rating newRating = rating.get();
            newRating.setStarRating(ratingDetails.getStarRating());
            newRating.setDescription(ratingDetails.getDescription());
            return ratingRepository.save(newRating);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No rating exists with this id: " + ratingId);
        }
    }

    // DELETE
    public void deleteRating(Long ratingId) {
        try {
            ratingRepository.deleteById(ratingId);
        } catch (EmptyResultDataAccessException exception){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No Review exists with that ID");
        }
    }

}
