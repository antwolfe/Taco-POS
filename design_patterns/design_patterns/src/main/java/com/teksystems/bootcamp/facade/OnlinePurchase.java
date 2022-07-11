package com.teksystems.bootcamp.facade;

public class OnlinePurchase {

    User user = new User();
    boolean paymentOk;
    Inventory inventory = new Inventory();
    InventoryItems itemToPurchase;
    Billing bill = new Billing();
    Payment paymentInformation = new Payment();
    Shipping address = new Shipping();


    public void makeOnlinePurchase(String item) {
        user.purchaseRequest(item);
        itemToPurchase = inventory.verifyInventoryItem(item);
        paymentOk = paymentInformation.makePurchase(itemToPurchase);
        bill.generateBill(itemToPurchase, paymentOk);
        address.sendAddressDetails();
//        request.verifyPurchaseToUser(item);

}

//    public void verifyPurchaseToUser(Inventory itemToBuy) {
//        if (payment.isEnough(itemToBuy, userAccountAmount)) {
//            System.out.println("Purchase Complete");
//        } else {
//            System.out.println("Purchase Failed");
//        }
    }

