package com.teksystems.bootcamp.facade;

public class OnlinePurchase {

    User user = new User();
    String purchaseRequest;
    Inventory inventory = new Inventory();
    InventoryItems itemToPurchase;
    Billing bill = new Billing();
    Payment paymentInformation = new Payment();
    Shipping address = new Shipping();


    public void makeOnlinePurchase(String item) {
        user.purchaseRequest(item);
        itemToPurchase = inventory.verifyInventoryItem(item);
        bill.generateBill(itemToPurchase);
        paymentInformation.makePurchase(itemToPurchase);
//        address.sendAddressDetails();
//        request.verifyPurchaseToUser(item);

}

//    public void verifyPurchaseToUser(Inventory itemToBuy) {
//        if (payment.isEnough(itemToBuy, userAccountAmount)) {
//            System.out.println("Purchase Complete");
//        } else {
//            System.out.println("Purchase Failed");
//        }
    }

