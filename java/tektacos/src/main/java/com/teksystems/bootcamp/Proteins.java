package com.teksystems.bootcamp;

public enum Proteins {

    GROUNDBEEF("ground beef"),
    STEAK("steak"),
    CHICKEN("chicken"),
    SHREDDEDPORK("shredded pork"),
    BLACKBEANS("black beans");

    private final String displayName;

    Proteins(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
