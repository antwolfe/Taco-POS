package com.teksystems.bootcamp.facade;

public class OnlinePurchase {

    User user = new User();
    String purchaseRequest;
    Inventory inventory = new Inventory();
    Billing bill = new Billing();
    Payment paymentInformation = new Payment();
    Shipping address = new Shipping();


    public void makeOnlinePurchase(String item) {
        user.purchaseRequest(item);
        System.out.println(inventory.isItemInStock(item));
        bill.generateBill(item);
//        paymentInformation.makePurchase();
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

