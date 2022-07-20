package com.teksystems.bootcamp.springboot.movierental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Year;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Film {

    public Film(Integer id){
        this.id = id.shortValue();
    }

    public short getId(){
        return this.id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Getter @Setter
    short id;

    @Column(name = "film_title")
    @Getter @Setter
    String title;

    @Column(name = "film_description")
    @Getter @Setter
    String description;



}
