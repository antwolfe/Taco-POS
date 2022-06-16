package com.teksystems.bootcamp;

public enum Tortilla {
    FLOUR("flour"),
    CORN("corn");

    private final String displayName;

    Tortilla(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}



