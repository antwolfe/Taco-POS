package com.teksystems.bootcamp;

public enum Drinks implements MenuItem {

    SODA("soda"),
    TEA("tea"),
    WATER("water");
    private final String displayName;

    Drinks(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getDescription() {
        return displayName;
    }
}
