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
        System.out.println("User has started a purchase request for " + item);
        itemToPurchase = inventory.verifyInventoryItem(item);
        paymentOk = paymentInformation.makePurchase(user, itemToPurchase);
        bill.generateBill(itemToPurchase, paymentOk);
        shipping.sendAddressDetails(user.getAddress());
        verifyPurchaseToUser(itemToPurchase);
    }


    private void verifyPurchaseToUser(InventoryItem itemToBuy) {
        if (paymentOk) {
            System.out.println("Purchase Complete");
        } else {
            System.out.println("Purchase Failed");
        }
    }
}

