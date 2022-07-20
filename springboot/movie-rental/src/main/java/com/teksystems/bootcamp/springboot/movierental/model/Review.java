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

    public Review(short id){
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter @Setter
    private short id;

    @ManyToOne
    @JoinColumn(name = "rating_id", nullable = false)
    @Getter @Setter
    private Rating rating;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false, columnDefinition = "SMALLINT UNSIGNED NOT NULL")
    @Getter @Setter
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "film_id", nullable = false, columnDefinition = "SMALLINT UNSIGNED NOT NULL")
    private Film film;

    @Column(name = "review")
    @Getter @Setter
    private String review;


}
