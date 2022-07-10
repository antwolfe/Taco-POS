package com.teksystems.bootcamp.facade;

public class OnlinePurchase {

    User request = new User();
    Inventory itemToPurchase;
    Billing bill = new Billing();
    Payment paymentInformation = new Payment();
    Shipping address = new Shipping();

    public OnlinePurchase(User request, Inventory itemToPurchase, Billing bill,
                          Payment paymentInformation, Shipping address) {
        this.request = request;
        this.itemToPurchase = itemToPurchase;
        this.bill = bill;
        this.paymentInformation = paymentInformation;
        this.address = address;
    }

    public void makeOnlinePurchase(Inventory item) {
        request.purchaseRequest();
        itemToPurchase.verifyInventoryItem(item);
        bill.generateBill();
        paymentInformation.makePurchase();
        address.sendAddressDetails();
        request.verifyPurchaseToUser(item);
        }



}
