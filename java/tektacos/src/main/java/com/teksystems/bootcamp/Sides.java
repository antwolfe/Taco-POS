package com.teksystems.bootcamp;

public enum Sides implements MenuItem {

    CHIPS_SALSA("chips and salsa"),
    CHIPS_QUESO("chips and queso"),
    FRIES("fries");
    private final String displayName;

    Sides(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public double getPrice() {
        return 2.5;
    }

    @Override
    public String getDescription() {
        return this.displayName;
    }
}
