package com.teksystems.bootcamp;

import java.util.ArrayList;

public class VeggieTaco extends Taco implements MenuItem {
    int toppingLimit = 4;
    public VeggieTaco() {
        super(4, Tortillas.CORN, Proteins.BLACKBEANS, new ArrayList<>());
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

    @Override
    public void addTopping(Toppings newToppings) {
        ArrayList<Toppings> toppingsList = getToppingList();

        if (toppingsList.toArray().length < toppingLimit) {
            toppingsList.add(newToppings);
        } else {
            System.out.println("You cannot add anymore toppings.");
        }
    }
}
