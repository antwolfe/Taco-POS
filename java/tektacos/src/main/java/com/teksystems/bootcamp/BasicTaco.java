package com.teksystems.bootcamp;

import java.util.ArrayList;

public class BasicTaco extends Taco implements MenuItem {



    public BasicTaco() {
        super("basic", "flour", "ground beef", new ArrayList<>());
    }

    @Override
    public double getPrice() {
        return 3.75;
    }

    @Override
    public String getDescription() {
        return "basic taco with something";
    }
}

