package com.teksystems.bootcamp;

public enum Tortillas implements MenuItem {
    FLOUR("flour"),
    CORN("corn");

    private final String displayName;

    Tortillas(String displayName) {
        this.displayName = displayName;
    }

    public String toString() {
        return displayName;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}



