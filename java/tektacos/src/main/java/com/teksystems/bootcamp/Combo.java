package com.teksystems.bootcamp;

import java.util.ArrayList;

public class Combo implements MenuItem {

    Taco taco;
    Sides side;
    Drinks drink;

    public Combo(Taco taco, Sides side, Drinks drink) {
        this.taco = taco;
        this.side = side;
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        return 8.25;
    }

    @Override
    public String getDescription() {
        return "Combo meal --> " +
                ""
    }
}
