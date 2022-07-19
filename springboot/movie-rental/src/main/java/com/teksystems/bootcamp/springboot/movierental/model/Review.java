package com.teksystems.bootcamp.springboot.movierental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

// connect customer to film to rating
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter @Setter
    private Long id;

    @Column(name = "rating_id")
    @Getter @Setter
    private Long ratingId;

    @Column(name = "customer_id")
    @Getter @Setter
    private Long customerId;

    @Column(name = "film_id")
    @Getter @Setter
    private Long filmId;

}
