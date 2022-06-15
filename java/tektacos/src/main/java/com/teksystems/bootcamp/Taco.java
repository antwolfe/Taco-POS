package com.teksystems.bootcamp;

import java.util.ArrayList;

public abstract class Taco {

    private String tacoType;
    private String tortilla;
    private String protein;
    private ArrayList<String> toppingList;


    public Taco(String tacoType, String tortilla, String protein, ArrayList<String> toppingList) {
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

    public String getTortilla() {
        return tortilla;
    }

    public void setTortilla(String tortilla) {
        this.tortilla = tortilla;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public ArrayList<String> getToppingList() {
        return toppingList;
    }

    public void setToppingList(ArrayList<String> toppingList) {
        this.toppingList = toppingList;
    }
}
