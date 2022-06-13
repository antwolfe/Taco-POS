package com.teksystems.bootcamp;

import java.util.Scanner;

public class makeOrder {

    Taco newTaco;
//    Side newSide;
//    Drink newDrink;


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
