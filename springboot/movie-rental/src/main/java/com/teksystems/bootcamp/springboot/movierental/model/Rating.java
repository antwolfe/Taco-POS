package com.teksystems.bootcamp.springboot.movierental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Rating {

    public Rating(Long id){
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    Long id;

//    @Size(max = 5)
    @Column(name = "star_rating")
    @Getter @Setter
    private int starRating;

    @Column(name = "description")
    @Getter @Setter
    private String description;

    @OneToMany(mappedBy = "rating")
    private List<Review> reviews;



}
