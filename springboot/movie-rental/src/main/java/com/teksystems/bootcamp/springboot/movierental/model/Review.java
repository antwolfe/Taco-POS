package com.teksystems.bootcamp.springboot.movierental.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// connect customer to film to rating
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rating_id", nullable = false)
    private Rating rating;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;

    public Long getId() {
        return id;
    }

    public Long getRating() {
        return rating.getId();
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public short getCustomer() {
        return customer.getId();
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public short getFilm() {
        return film.getFilmId();
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
