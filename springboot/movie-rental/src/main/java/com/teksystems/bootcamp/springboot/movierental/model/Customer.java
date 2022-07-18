package com.teksystems.bootcamp.springboot.movierental.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.sql.Time;
import java.sql.Timestamp;


@AllArgsConstructor
public class Customer {
    @Getter
    @Setter
    private short id;
    @Getter
    @Setter
    private int storeId;
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private short addressId;
    @Getter
    @Setter
    private int active;
    @Getter
    @Setter
    private Timestamp createDate;
    @Getter
    @Setter
    private Time lastUpdate;


    public Customer(short id, int storeId, String firstName, String lastName, String email) {
        this.id = id;
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", storeId=").append(storeId);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
