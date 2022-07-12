package com.teksystems.bootcamp.facade;


public class Inventory {


    public InventoryItem verifyInventoryItem(String itemToPurchase) {
        InventoryItem item = null;
        for (InventoryItem inventoryItem : InventoryItem.values()) {
            if (itemToPurchase.toLowerCase().equals(inventoryItem.getName()) && isItemInStock(inventoryItem)) {
                    item = inventoryItem;
            }
        }
        return item;
    }

    public boolean isItemInStock(InventoryItem itemToPurchase) {
        if (itemToPurchase != null) {
            return itemToPurchase.isInStock();
        } else {
            System.out.println("Item not in stock");
            return false;
        }
    }


}
