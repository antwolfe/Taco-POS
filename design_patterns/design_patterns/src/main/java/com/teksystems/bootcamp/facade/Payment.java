package com.teksystems.bootcamp.facade;

public class Payment {

    int userAccountAmount = 50;



    public boolean isEnough(Inventory item) {
        return userAccountAmount > item.getPrice();
    }
}
