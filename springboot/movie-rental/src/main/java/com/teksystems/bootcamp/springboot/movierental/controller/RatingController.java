package com.teksystems.bootcamp.springboot.movierental.controller;

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
    public List<Customer> getAllCustomers() {
        return ratingService.getAllCustomers();
    }

    @PostMapping("/")
    public Customer createCustomer(@RequestBody Customer customer) {
        return ratingService.createCustomer(customer);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable(name= "id") Long customerId,
                                   @RequestBody Customer customerDetails) {
        return ratingService.updateCustomer(customerId, customerDetails);
    }

    @DeleteMapping("/{ratingId}") // if variable in param is same as in path, name = is not needed
    public void deleteCustomer(@PathVariable Long customerId) {
        ratingService.deleteCustomer(customerId);
    }

}
