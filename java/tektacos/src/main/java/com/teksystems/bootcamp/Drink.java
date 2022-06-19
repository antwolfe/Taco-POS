package com.teksystems.bootcamp;

public class Drink implements MenuItem {

    String drink;

    public Drink(String chosenDrink) {
        this.drink = chosenDrink;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        return 2.00;
    }

    @Override
    public String getDescription() {
        return "This is a drink";
    }
}
