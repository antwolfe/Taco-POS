package com.teksystems.bootcamp.springboot.movierental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter @Setter
    private Long id;

    @Column(name = "rating")
    @Getter @Setter
    private int starRating;

    @Column(name = "description")
    @Getter @Setter
    private String description;

    public Rating(int rating, String description) {
        this.starRating = rating;
        this.description = description;
    }

}
