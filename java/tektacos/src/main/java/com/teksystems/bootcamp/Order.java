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

    public void printReceipt(Order order) {
        System.out.println("Here is your order: ");
        System.out.println(tacoType + " taco with " + tacoProtein + ",");
        for (String topping : tacoToppings) {
            System.out.print(topping + ", ");
        }
        System.out.println("on a " + tacoTortilla + " tortilla.");
    }

}

