package com.teksystems.bootcamp.springboot.movierental.controller;

import com.teksystems.bootcamp.springboot.movierental.services.CustomerService;
import com.teksystems.bootcamp.springboot.movierental.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // aka api controller
@RequestMapping("/api/customers")
// api resources

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // customer controller
    @GetMapping("/")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable(name= "id") Long customerId,
                                   @RequestBody Customer customerDetails) {
        return customerService.updateCustomer(customerId, customerDetails);
    }

    @DeleteMapping("/{customerId}") // if variable in param is same as in path, name = is not needed
    public void deleteCustomer(@PathVariable Long customerId) {
        customerService.deleteCustomer(customerId);
    }

}
