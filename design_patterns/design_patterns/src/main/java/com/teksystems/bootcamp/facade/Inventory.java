package com.teksystems.bootcamp.facade;


public class Inventory {

    InventoryItem[] inventoryItems = InventoryItem.values();


    public InventoryItem verifyInventoryItem(String itemToPurchase) {
        InventoryItem item = null;
        for (InventoryItem inventoryItem : inventoryItems) {
            if (itemToPurchase.toLowerCase().equals(inventoryItem.getName()) && isItemInStock(inventoryItem)) {
                item = inventoryItem;
                break;
            } else if (itemToPurchase.toLowerCase().equals(inventoryItem.getName()) && (!isItemInStock(inventoryItem))) {
                System.out.println("Item not in stock");
                break;
            }
        }
        return item;
    }

    public boolean isItemInStock(InventoryItem itemToPurchase) {
        if (itemToPurchase != null) {
            return itemToPurchase.isInStock();
        } else {
            return false;
        }
    }


}
