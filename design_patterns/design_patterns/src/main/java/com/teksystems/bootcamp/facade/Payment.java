package com.teksystems.bootcamp.facade;

public class Payment {

    double account;

    public boolean makePurchase(User user, InventoryItem item) {
        account = user.getUserAccountAmount();
        if (item == null) {
            return false;

        } else {
            if (account >= item.getPrice()) {
                double subtractedAmount = user.getUserAccountAmount() - item.getPrice();
                user.setUserAccountAmount(subtractedAmount);
                return true;
            }
        }
            return false;

    }
}
