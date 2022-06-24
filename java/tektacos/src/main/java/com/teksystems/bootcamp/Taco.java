package com.teksystems.bootcamp;

import java.util.ArrayList;

public abstract class Taco implements MenuItem {

    final int toppingLimit;
    private Tortillas tortillas;
    private Proteins proteins;
    private ArrayList<Toppings> toppingsList;


    public Taco(int toppingLimit , Tortillas tortillas, Proteins proteins, ArrayList<Toppings> toppingsList) {
        this.toppingLimit = toppingLimit;
        this.tortillas = tortillas;
        this.proteins = proteins;
        this.toppingsList = toppingsList;
    }

    public Tortillas getTortilla() {
        return tortillas;
    }

    public void setTortilla(Tortillas tortillas) {
        this.tortillas = tortillas;
    }

    public Proteins getProtein() {
        return proteins;
    }

    public void setProtein(Proteins proteins) {
        this.proteins = proteins;
    }

    public ArrayList<Toppings> getToppingList() {
        return toppingsList;
    }

    public abstract void addTopping(Toppings newToppings);

}
