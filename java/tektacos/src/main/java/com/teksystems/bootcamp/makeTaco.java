package com.teksystems.bootcamp;

import java.util.ArrayList;

public class makeTaco {

    Taco newTaco;
    Tortilla newTortilla;
    Protein newProtein;
    ArrayList<Topping> toppings;


    public void makeBasicTaco() {
        System.out.println("Making Basic Taco");


    }

    public void makeDeluxeTaco() {
    }

    public void makeVeggieTaco() {
    }


    public static String createTaco(int tacoType) {
        switch (tacoType) {
            case 1:
                return "basic";
            case 2:
                return "deluxe";
            case 3:
                return "veggie";
            default:
                return "basic taco meal";
        }
    }


}
