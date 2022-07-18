package com.teksystems.bootcamp.springboot.movierental.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import java.sql.Array;
import java.sql.Timestamp;
import java.time.Year;

@Entity
public class Film {

    @Getter @Setter
    private short filmId;

    @Getter @Setter
    private String title;

    @Getter @Setter
    private String description;

    @Getter @Setter
    private Year releaseYear;

    @Getter @Setter
    private int languageId;

    @Getter @Setter
    private int originalLanguageId;

    @Getter @Setter
    private int rentalDuration;

    @Getter @Setter
    private double replacementCost;

    @Getter @Setter
    private enum rating;

    @Getter @Setter
    private Array specialFeatures;

    @Getter @Setter
    private Timestamp lastUpdate;





}
