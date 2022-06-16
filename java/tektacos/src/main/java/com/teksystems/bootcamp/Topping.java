package com.teksystems.bootcamp;

public enum Topping {

    SHREDDEDLETTUCE("shredded lettuce"),
    TOMATO("tomato"),
    ONION("onion"),
    CHEESE("cheese"),
    SALSA("salsa"),
    CILANTRO("cilantro"),
    JALEPENO("jalepeño");

    private final String displayName;


    Topping(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

