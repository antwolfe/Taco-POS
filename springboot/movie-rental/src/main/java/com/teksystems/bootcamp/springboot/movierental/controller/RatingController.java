package com.teksystems.bootcamp.springboot.movierental.controller;

import com.teksystems.bootcamp.springboot.movierental.model.Rating;
import com.teksystems.bootcamp.springboot.movierental.services.RatingService;
import com.teksystems.bootcamp.springboot.movierental.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@RestController // aka api controller
@RequestMapping("/api/ratings")
// api resources

public class RatingController {

    @Autowired //creates injected instance
    private RatingService ratingService;

    //CREATE
    @PostMapping("/")
    public List<Rating> createRating(@RequestBody List<Rating> ratings) {
        return ratingService.createRating(ratings);
    }

   // READ
    @GetMapping("/")
    public List<Rating> getRatings(@RequestParam(required = false) Integer page,
                                   @RequestParam(required = false) Integer limit) {
        return ratingService.getRatings(page, limit);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Rating updateRating(@PathVariable(name= "id") @Valid Long ratingId,
                                   @RequestBody Rating ratingDetails) {
        return ratingService.updateRating(ratingId, ratingDetails);
    }

    // DELETE
    @DeleteMapping("/{ratingId}")
    public void deleteRating(@PathVariable Long ratingId) {
        ratingService.deleteRating(ratingId);
    }

    // Controller Notes:
    // if variable in param is same as in path, name = is not needed
}
