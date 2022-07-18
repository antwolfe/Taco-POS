package com.teksystems.bootcamp.springboot.movierental.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int film_id;

    @Column
    private String name;

    @Column
    private String description;

}
