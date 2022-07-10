package com.teksystems.bootcamp.facade;

public class OnlinePurchaseFacade {

    Purchase request;
    Inventory items;
    Billing bill;
    Payment paymentInformation;
    Shipping address;

    public OnlinePurchaseFacade(Purchase request, Inventory items, Billing bill,
                                Payment paymentInformation, Shipping address) {
        this.request = request;
        this.items = items;
        this.bill = bill;
        this.paymentInformation = paymentInformation;
        this.address = address;
    }

    purchaseRequest() {}
    verifyInventory() {}
    generateBill() {}
    makePurchase() {}
    sendAddressDetails() {}
    verifyPurchaseToUser() {}

}
