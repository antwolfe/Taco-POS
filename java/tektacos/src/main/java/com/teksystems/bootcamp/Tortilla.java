package com.teksystems.bootcamp;

public enum Tortilla implements MenuItem {
    FLOUR("flour"),
    CORN("corn");

    private final String displayName;

    Tortilla(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
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



