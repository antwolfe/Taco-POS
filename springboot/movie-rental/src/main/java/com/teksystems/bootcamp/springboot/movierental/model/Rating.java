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
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter
    private Long id;

    @Size(max = 5)
    @Column(name = "star_rating")
    @Getter @Setter
    private int starRating;

    @Column(name = "description")
    @Getter @Setter
    private String description;

    public Rating(int starRating, String desc){
        this.starRating = starRating;
        this.description = desc;
    }

}
