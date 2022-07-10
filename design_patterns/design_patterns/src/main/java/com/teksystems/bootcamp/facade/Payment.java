package com.teksystems.bootcamp.facade;

public class Payment {




    public boolean isEnough(Inventory item, int account) {
        return account > item.getPrice();
    }
}
