package com.teksystems.bootcamp;

public enum Toppings {

    SHREDDEDLETTUCE("shredded lettuce"),
    TOMATO("tomato"),
    ONION("onion"),
    CHEESE("cheese"),
    SALSA("salsa"),
    CILANTRO("cilantro"),
    JALEPENO("jalepeño");
    private final String displayName;


    Toppings(String displayName) {
        this.displayName = displayName;
    }


    @Override
    public String toString() {
        return displayName;
    }
}

