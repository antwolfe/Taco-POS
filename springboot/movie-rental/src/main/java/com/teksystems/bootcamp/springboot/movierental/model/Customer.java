package com.teksystems.bootcamp.springboot.movierental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    public Customer(Integer id){
        this.id = id.shortValue();
    }

    public short getCustomerId(){
        return this.id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED NOT NULL")
    @Getter @Setter
    short id;

    @Column(name = "first_name")
    @Getter @Setter
    String firstName;

    @Column(name = "last_name")
    @Getter @Setter
    String lastName;


}
