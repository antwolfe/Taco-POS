package com.teksystems.bootcamp.springboot.movierental.controller;

import com.teksystems.bootcamp.springboot.movierental.model.Rating;
import com.teksystems.bootcamp.springboot.movierental.services.RatingService;
import com.teksystems.bootcamp.springboot.movierental.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // aka api controller
@RequestMapping("/api/ratings")
// api resources

public class RatingController {

    @Autowired
    private RatingService ratingService;

    // customer controller
    @GetMapping("/")
    public List<Rating> getAllCustomers() {
        return ratingService.getAllRatings();
    }


    @PostMapping("/")
    public Rating createRating(@RequestBody Rating rating) {
        return ratingService.createRating(rating);
    }


    @PutMapping("/{id}")
    public Rating updateRating(@PathVariable(name= "id") Long ratingId,
                                   @RequestBody Rating ratingDetails) {
        return ratingService.updateRating(ratingId, ratingDetails);
    }

    @DeleteMapping("/{ratingId}") // if variable in param is same as in path, name = is not needed
    public void deleteRating(@PathVariable Long ratingId) {
        ratingService.deleteRating(ratingId);
    }

}
