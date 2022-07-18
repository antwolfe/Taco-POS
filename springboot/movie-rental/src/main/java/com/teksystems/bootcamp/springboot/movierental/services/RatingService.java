package com.teksystems.bootcamp.springboot.movierental.services;

import com.teksystems.bootcamp.springboot.movierental.model.Customer;
import com.teksystems.bootcamp.springboot.movierental.repository.RatingRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public List<Customer> getAllCustomers() {
        return ratingRepository.findAll();
    }

    public Customer createCustomer(Customer customer) {
        return ratingRepository.save(customer);
    }

    public Customer updateCustomer(Long customerId, Customer customerDetails) {
        Customer customer = ratingRepository.getReferenceById(customerId);
        customer.setFirstName(customerDetails.getFirstName());
        customer.setLastName(customer.getLastName());
        return ratingRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        ratingRepository.deleteById(customerId);
    }
}
