package com.teksystems.bootcamp;

import java.util.ArrayList;

public class Combo implements MenuItem {

    ArrayList<Order> combo;

    public Combo() {
        this.combo = new ArrayList<>();
    }

    public void addItemToCombo(Order order){
        combo.add(order);
    }

    @Override
    public double getPrice() {
        return 8.25;
    }

    @Override
    public String getDescription() {
        return "Combo meal --> "
                + combo.size();
    }
}
