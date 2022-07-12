package com.teksystems.bootcamp.factories;

public class SantasFactory {


    public Gift makeGift(String status) {

        if (status.equals("nice")) {
            return new Toy();
        } else {
            return new Coal();
        }
    }

}
