package com.teksystems.bootcamp;

import java.util.ArrayList;

public class BasicTaco extends Taco {

    public BasicTaco() {
        super("basic", Tortillas.FLOUR, Proteins.GROUNDBEEF, new ArrayList<>());
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
                + (getToppingList().isEmpty() ? "no toppings" : getToppingList()) + " as toppings.";
    }

    @Override
    public void addTopping(Toppings newToppings) {
        ArrayList<Toppings> toppingsList = getToppingList();
        int toppingLimit = 4;
        if (toppingsList.toArray().length < toppingLimit) {
            toppingsList.add(newToppings);
        } else {
            System.out.println("You cannot add anymore toppings.");
        }
    }

}

