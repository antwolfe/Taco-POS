package com.teksystems.bootcamp.facade;

public enum InventoryItem {

    SHIRT(8.99, true),
    PANTS(9.99, true),
    SOCKS(3.99, false),
    HAT(15.00, false),
    SHOES(100.00, true),
    JEWELERY(5.00, false),
    NO_ITEM(0.00, false),
    ;
    final double price;
    final boolean inStock;


  InventoryItem(double price, boolean inStock) {
        this.price = price;
        this.inStock = inStock;
    }


    boolean isInStock(){
        return inStock;
    }

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }

    public double getPrice() {
      return price;
    }
}
