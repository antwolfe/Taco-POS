package com.teksystems.bootcamp.facade;


public class Inventory {


    public InventoryItems verifyInventoryItem(String itemToPurchase) {
        InventoryItems item = null;
        for (InventoryItems inventoryItem : InventoryItems.values()) {
            if (itemToPurchase.equals(inventoryItem.toString())) {
                if (isItemInStock(inventoryItem)) {
                    item = inventoryItem;
                }
            }
        }
        return item;
    }

    public boolean isItemInStock(InventoryItems itemToPurchase) {
        if (itemToPurchase != null) {
            return itemToPurchase.isInStock();
        } else {
            return false;
        }
    }


}
