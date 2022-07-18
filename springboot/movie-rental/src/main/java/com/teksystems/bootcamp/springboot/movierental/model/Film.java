//package com.teksystems.bootcamp.springboot.movierental.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.sql.Array;
//import java.sql.Timestamp;
//import java.time.Year;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//public class Film {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    @Getter @Setter
//    private short filmId;
//
//    @Getter @Setter
//    private String title;
//
//    @Getter @Setter
//    private String description;
//
//    @Getter @Setter
//    private Year releaseYear;
//
//    @Getter @Setter
//    private int languageId;
//
//    @Getter @Setter
//    private int originalLanguageId;
//
//    @Getter @Setter
//    private int rentalDuration;
//
//    @Getter @Setter
//    private double replacementCost;
//
////    @Getter
////    private enum rating;
//
//    @Getter @Setter
//    private Array specialFeatures;
//
//    @Getter @Setter
//    private Timestamp lastUpdate;
//
//
//
//
//
//}
