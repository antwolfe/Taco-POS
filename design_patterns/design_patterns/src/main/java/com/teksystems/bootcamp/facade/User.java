package com.teksystems.bootcamp.facade;

public class User {

    double userAccountAmount = 50;
    String address = "1234 Britton Rd,\n St.Ave City,\n Michigan 20430";

    public void purchaseRequest(String item) {
        System.out.println("User has started a purchase request for " + item);
    };

    public double getUserAccountAmount() {
        return userAccountAmount;
    }

    public void setUserAccountAmount(double amount) {
        this.userAccountAmount = amount;
    }


}

