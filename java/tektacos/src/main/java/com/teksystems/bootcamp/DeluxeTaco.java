package com.teksystems.bootcamp;

import java.util.ArrayList;
import java.util.Arrays;

public class DeluxeTaco extends Taco implements MenuItem {

    public DeluxeTaco() {
        super("deluxe", Tortillas.FLOUR, Proteins.STEAK, new ArrayList<>(Arrays.asList(Toppings.SHREDDEDLETTUCE, Toppings.ONION, Toppings.TOMATO, Toppings.CHEESE)));
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

    @Override
    public void addTopping(Toppings newToppings) {
        ArrayList<Toppings> toppingsList = getToppingList();
        int toppingLimit = 6;
        if (toppingsList.toArray().length < toppingLimit) {
            toppingsList.add(newToppings);
        } else {
            System.out.println("You cannot add anymore toppings.");
        }
    }

}
