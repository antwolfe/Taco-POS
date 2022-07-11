package com.teksystems.bootcamp.facade;

public class OnlinePurchase {

    User user = new User();
    Inventory inventory = new Inventory();
    InventoryItem itemToPurchase;
    Payment paymentInformation = new Payment();
    boolean paymentOk;
    Billing bill = new Billing();
    Shipping shipping = new Shipping();


    public void makeOnlinePurchase(String item) {
        System.out.println();
        System.out.println("--------Online Purchase---------");
        System.out.println("User has started a purchase request for " + item + ".\nAccount has $" + user.getUserAccountAmount());
        itemToPurchase = inventory.verifyInventoryItem(item);
        paymentOk = paymentInformation.makePurchase(user, itemToPurchase);
        bill.generateBill(itemToPurchase, paymentOk, user);
        shipping.sendAddressDetails(user.getAddress());
        verifyPurchaseToUser();
    }


    private void verifyPurchaseToUser() {
        if (paymentOk) {
            System.out.println("Purchase Complete");
        } else {
            System.out.println("Purchase Failed");
        }
    }
}

