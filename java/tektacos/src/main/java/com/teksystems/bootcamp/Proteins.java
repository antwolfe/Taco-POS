package com.teksystems.bootcamp;

public enum Proteins implements MenuItem {

    GROUNDBEEF("ground beef"),
    STEAK("steak"),
    CHICKEN("chicken"),
    SHREDDEDPORK("shredded pork"),
    BLACKBEANS("black beans");
    private final String displayName;
//    private final int price;

    Proteins(String displayName) {
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
