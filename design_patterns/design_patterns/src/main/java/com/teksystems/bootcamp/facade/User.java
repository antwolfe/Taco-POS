package com.teksystems.bootcamp.facade;

public class User {

    double userAccountAmount = 50;
    Payment payment;
    Inventory itemToBuy;

    public void purchaseRequest(String item) {
        System.out.println("User has started a purchase request for " + item);
    };

    public double getUserAccountAmount() {
        return userAccountAmount;
    }

    public Payment getPayment() {
        return payment;
    }

    public Inventory getItemToBuy() {
        return itemToBuy;
    }
}

