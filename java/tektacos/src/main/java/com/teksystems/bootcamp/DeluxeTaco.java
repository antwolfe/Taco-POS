package com.teksystems.bootcamp;

import java.util.ArrayList;
import java.util.Arrays;

public class DeluxeTaco extends Taco implements MenuItem {

    public DeluxeTaco() {
        super("deluxe", Tortilla.FLOUR, Protein.STEAK, new ArrayList<>(Arrays.asList(Topping.SHREDDEDLETTUCE, Topping.ONION, Topping.TOMATO, Topping.CHEESE)));
    }


    @Override
    public double getPrice() {
        return 5.25;
    }

    @Override
    public String getDescription() {
        return "Deluxe taco with "
                + getTortilla().getDisplayName() + " tortilla, "
                + getProtein().getDisplayName() + ", and...\n"
                + getToppingList() + " as toppings.";
    }
}
