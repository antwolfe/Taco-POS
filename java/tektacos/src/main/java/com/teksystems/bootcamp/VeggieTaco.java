package com.teksystems.bootcamp;

import java.util.ArrayList;

public class VeggieTaco extends Taco implements MenuItem {
    public VeggieTaco() {
        super("veggie", Tortilla.CORN , Protein.BLACKBEANS, new ArrayList<>());
    }

    @Override
    public double getPrice() {
        return 2.75;
    }

    @Override
    public String getDescription() {
       return "Veggie taco with "
                + getTortilla().getDisplayName() + " tortilla, "
                + getProtein().getDisplayName() + ", and...\n"
                + getToppingList() + " as toppings.";
    }
}
