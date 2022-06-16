package com.teksystems.bootcamp;

import java.util.ArrayList;
import java.util.Arrays;

public class DeluxeTaco extends Taco {

    public DeluxeTaco() {
        super("deluxe", Tortilla.FLOUR, Protein.STEAK, new ArrayList<>(Arrays.asList("shredded lettuce", "onion", "tomato", "cheese")));
    }



}
