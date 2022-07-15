package com.teksystems.bootcamp.springboot.movierental.Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController // aka api controller
//RequestMapping
// api resources
public class CustomerController {
    Customer customer = new Customer(
            (short) 1,
            1,
            "Anthony",
            "Wolfe",
            "awolfe@gmx.com");

    // customer controller
    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return List.of(
                customer
        );
    }

}
