package com.teksystems.bootcamp.facade;

public class Payment {

    User user = new User();

    public boolean makePurchase(InventoryItems item) {
        double account = user.getUserAccountAmount();
        if (account >= item.getPrice()) {
            System.out.println();
            double amount = user.getUserAccountAmount() - item.getPrice();
            user.setUserAccountAmount(amount);
            return true;
        }
        return false;
    }


//    public boolean isEnough(Inventory item, int account) {
//        return account > item.getPrice();
//    }
}
