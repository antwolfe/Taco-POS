package com.teksystems.bootcamp.springboot.movierental;

import com.teksystems.bootcamp.springboot.movierental.Customer.Customer;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class MovieRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRentalApplication.class, args);
	}


}
