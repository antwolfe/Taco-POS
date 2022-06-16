package com.teksystems.bootcamp;

import java.util.ArrayList;

public abstract class Taco {

    private String tacoType;
    private Tortilla tortilla;
    private Protein protein;
    private ArrayList<String> toppingList;


    public Taco(String tacoType, Tortilla tortilla, Protein protein, ArrayList<String> toppingList) {
        this.tacoType = tacoType;
        this.tortilla = tortilla;
        this.protein = protein;
        this.toppingList = toppingList;
    }


    public String getTacoType() {
        return tacoType;
    }

    public void setTacoType(String tacoType) {
        this.tacoType = tacoType;
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

    public ArrayList<String> getToppingList() {
        return toppingList;
    }

    public void setToppingList(ArrayList<String> toppingList) {
        this.toppingList = toppingList;
    }

    public void addTopping(String newTopping) {
        toppingList.add(newTopping);
    }
}
