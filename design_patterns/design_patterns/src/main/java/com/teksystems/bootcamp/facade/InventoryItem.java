package com.teksystems.bootcamp.facade;

public enum InventoryItem {

    SHIRT("shirt", 8.99, true),
    PANTS("pants", 9.99, true),
    SOCKS("socks", 3.99, false),
    HAT("hat", 15.00, false),
    SHOES("shoes",100.00, true),
    JEWELERY("jewelery", 5.00, false),
    NO_ITEM("no item", 0.00, false),
    ;
    final double price;
    final boolean inStock;
    final String name;


  InventoryItem(String name, double price, boolean inStock) {
      this.name = name;
      this.price = price;
      this.inStock = inStock;
    }

    String getName() { return name; }

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
