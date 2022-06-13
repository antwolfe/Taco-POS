package com.teksystems.bootcamp;

public interface makeOrder {

    static String createTaco(int tacoType) {
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
