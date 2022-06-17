package com.teksystems.bootcamp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Taco implements MenuItem {

    private String tacoType;
    private Tortilla tortilla;
    private Protein protein;
    private ArrayList<Topping> toppingList;


    public Taco(String tacoType, Tortilla tortilla, Protein protein, ArrayList<Topping> toppingList) {
        this.tacoType = tacoType;
        this.tortilla = tortilla;
        this.protein = protein;
        this.toppingList = toppingList;
    }


    public Tortilla getTortilla() {
        return tortilla;
    }

    public void setTortilla(Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public ArrayList<Topping> getToppingList() {
        return toppingList;
    }


    public void setToppingList(ArrayList<Topping> toppingList) {
        this.toppingList = toppingList;
    }

    public abstract void addTopping(Topping newTopping);

}
