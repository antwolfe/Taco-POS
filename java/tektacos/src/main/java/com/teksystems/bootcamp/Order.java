package com.teksystems.bootcamp;

import java.util.ArrayList;

public class Order {
    Taco taco;
    String tacoType;
    String tacoTortilla;
    String tacoProtein;
    ArrayList<String> tacoToppings;

    public Order(Taco taco) {
        this.taco = taco;
        this.tacoType = taco.getTacoType();
        this.tacoTortilla = taco.getTortilla();
        this.tacoProtein = taco.getProtein();
        this.tacoToppings = taco.getToppingList();
    }



}

