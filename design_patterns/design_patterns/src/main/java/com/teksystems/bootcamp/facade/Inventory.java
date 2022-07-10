package com.teksystems.bootcamp.facade;

import java.util.ArrayList;

public class Inventory {

    String name;
    int price;
    boolean inStock;
    ArrayList<Inventory> inventoryList = new ArrayList<>();

    public Inventory(String name, int price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }


    public boolean verifyInventoryItem(Inventory itemToPurchase) {
        for (Inventory inventoryItem : inventoryList) {
            inStock = inventoryItem == itemToPurchase;
        }
        return inStock;
    }

    public int getPrice() {
        return price;
    }



}
