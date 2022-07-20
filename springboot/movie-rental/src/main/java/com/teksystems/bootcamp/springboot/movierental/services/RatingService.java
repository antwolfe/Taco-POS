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

@AllArgsConstructor
@NoArgsConstructor
@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    public List<Rating> createRating(List<Rating> ratings) {
        return ratingRepository.saveAll(ratings);
    }

    public Rating updateRating(Long ratingId, Rating ratingDetails) {
        Rating rating = ratingRepository.findById(ratingId).get();
        return ratingRepository.save(rating);
    }

    public void deleteRating(Long ratingId) {
        try {
            ratingRepository.deleteById(ratingId);
        } catch (EmptyResultDataAccessException exception){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No Review exists with that ID");
        }
    }


}
