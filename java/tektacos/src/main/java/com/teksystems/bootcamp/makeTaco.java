package com.teksystems.bootcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class makeTaco {
Scanner scIN = new Scanner(System.in);
    Tortilla newTortilla;
    Protein newProtein;
    ArrayList<Topping> toppings;


    public void makeBasicTaco() {
        System.out.println("Making Basic Taco...");
        this.newTortilla = new Tortilla();
        newTortilla.setTortillaType();
        newTortilla.displayChosenTortilla(newTortilla.tortillaType);
        this.newProtein = new Protein();
        newProtein.setProtein();
        newProtein.displayChosenProtein(newProtein.proteinType);

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
