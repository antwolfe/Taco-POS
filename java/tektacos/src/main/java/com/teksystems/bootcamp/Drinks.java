package com.teksystems.bootcamp;

public enum Drinks implements MenuItem {

    SODA("soda"),
    TEA("tea"),
    WATER("water");
    private final String displayName;

    Drinks(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public double getPrice() {
        return 1.5;
    }

    @Override
    public String getDescription() {
        return displayName;
    }
}
