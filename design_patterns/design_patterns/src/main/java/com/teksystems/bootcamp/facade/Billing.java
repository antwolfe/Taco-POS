package com.teksystems.bootcamp.facade;

public class Billing {

    public void generateBill(InventoryItems item)
    {
        System.out.println();
        System.out.println(" Purchase Bill");
        System.out.println("----------------");
        System.out.println("Item: " + item.toString());
        System.out.println("Amount: " + item.getPrice());
    }

}
