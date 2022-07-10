package com.teksystems.bootcamp.facade;


public class Inventory {

    boolean inStock;


    public InventoryItems verifyInventoryItem(String itemToPurchase) {
        InventoryItems item = null;
        for (InventoryItems inventoryItem : InventoryItems.values()) {
            if (itemToPurchase.equals(inventoryItem.toString())) {
                item = inventoryItem;
            }
        }
            return item;
    }

    public boolean isItemInStock(String item) {
        InventoryItems itemToPurchase = verifyInventoryItem(item);
        if (itemToPurchase != null) {
            return itemToPurchase.isInStock();
        } else {
            return false;
        }
    }


}
