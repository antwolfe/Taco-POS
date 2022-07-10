package com.teksystems.bootcamp.facade;

public class User {

    int userAccountAmount = 50;
    Payment payment;
    Inventory itemToBuy;

    public void purchaseRequest() {
        System.out.println("User has started a purchase request");
    };

    public void verifyPurchaseToUser(Inventory itemToBuy) {
        if(payment.isEnough(itemToBuy, userAccountAmount)) {
            System.out.println("Purchase Complete");
        } else {
            System.out.println("Purchase Failed");
        }
    }


}
