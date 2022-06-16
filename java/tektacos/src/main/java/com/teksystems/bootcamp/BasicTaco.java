package com.teksystems.bootcamp;

import java.util.ArrayList;

public class BasicTaco extends Taco implements MenuItem {

    public BasicTaco() {
        super("basic", Tortilla.FLOUR, Protein.GROUNDBEEF, new ArrayList<Topping>());
    }

    @Override
    public double getPrice() {
        return 3.75;
    }

    @Override
    public String getDescription() {
        return "Basic taco with "
                + getTortilla().getDisplayName() + " tortilla, "
                + getProtein().getDisplayName() + ", and...\n"
                + getToppingList() + " as toppings.";
    }
}

