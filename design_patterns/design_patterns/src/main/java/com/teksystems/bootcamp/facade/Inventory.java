package com.teksystems.bootcamp.facade;


public class Inventory {


    public InventoryItem verifyInventoryItem(String itemToPurchase) {
       InventoryItem[] inventoryItems = InventoryItem.values();
       for (int i = 0; i <= inventoryItems.length; i++) {
            if (inventoryItems[i].toString().equals(itemToPurchase) && isItemInStock(inventoryItems[i])) {
               return inventoryItems[i];
           }
       }
       return InventoryItem.NO_ITEM;
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
