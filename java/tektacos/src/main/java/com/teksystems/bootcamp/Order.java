package com.teksystems.bootcamp;

import java.util.ArrayList;

public class Order {
    Taco taco;
    String tacoType;
    String tacoTortilla;
    String tacoProtein;
    ArrayList<String> tacoToppings;
    Drink drink;
    String drinkType;

    Side side;
    String sideType;

    public Order(Taco taco, Drink drink, Side side) {
        this.taco = taco;
        this.tacoType = taco.getTacoType();
        this.tacoTortilla = taco.getTortilla();
        this.tacoProtein = taco.getProtein();
        this.tacoToppings = taco.getToppingList();
        this.sideType = side.getSide();
        this.drinkType = drink.getDrink();
    }

    public void printReceipt(Order order) {
        System.out.println("Here is your order: ");
        System.out.println(tacoType + " taco with " + tacoProtein + ",");
        for (String topping : tacoToppings) {
            System.out.print(topping + ", ");
        }
        System.out.println("on a " + tacoTortilla + " tortilla.");
        System.out.println();
        System.out.println(sideType + " for sides.");
        System.out.println("A " + drinkType + " to drink.");
    }

}

