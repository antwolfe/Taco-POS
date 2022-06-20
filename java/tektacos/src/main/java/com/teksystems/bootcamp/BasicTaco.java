package com.teksystems.bootcamp;

import java.util.ArrayList;

public class BasicTaco extends Taco {
    private final int toppingLimit = 4;
    public BasicTaco() {
        super(4, Tortillas.FLOUR, Proteins.GROUNDBEEF, new ArrayList<>());
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

    @Override
    public double getPrice() {
        return 5.75;
    }


    @Override
    public String getDescription() {
        return "Basic taco with "
                + getTortilla().toString() + " tortilla, "
                + getProtein().toString() + ", and\n"
                + (getToppingList().isEmpty() ? "no toppings" : (getToppingList())
                + " as toppings.");
    }

}

