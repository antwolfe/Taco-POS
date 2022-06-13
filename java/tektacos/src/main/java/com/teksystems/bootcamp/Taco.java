package com.teksystems.bootcamp;

import java.util.ArrayList;

public class Taco {

    String tacoType;
    Tortilla tortillaType;
    String proteinType;
    ArrayList<Topping> toppingsList;

    public Taco(String tacoType, Tortilla tortillaType, String proteinType, ArrayList<Topping> toppingsList) {
        this.tacoType = tacoType;
        this.tortillaType = tortillaType;
        this.proteinType = proteinType;
        this.toppingsList = toppingsList;
    }

    void makeTaco() {
        System.out.println("Making taco..");
    }


}
