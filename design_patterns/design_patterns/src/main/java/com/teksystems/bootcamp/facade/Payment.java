package com.teksystems.bootcamp.facade;

public class Payment {

    public boolean makePurchase(User user, InventoryItem item) {
        double account = user.getUserAccountAmount();
        if (account >= item.getPrice() && item.getPrice() != 0) {
            double subtractedAmount = user.getUserAccountAmount() - item.getPrice();
            user.setUserAccountAmount(subtractedAmount);
            return true;
        }
        return false;
    }

}
